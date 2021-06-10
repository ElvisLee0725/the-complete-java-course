package com.elvislee.producerconsumer;

import java.util.List;

public class Consumer implements Runnable{
    List<Integer> questionList = null;

    public Consumer(List<Integer> questionList) {
        this.questionList = questionList;
    }

    public void answerQuestion() throws InterruptedException {
        synchronized (questionList) {
            while(questionList.isEmpty()) {
                System.out.println("No questions to answer, waiting for producer to get some");
                // Let thread wait for another thread to call .notify()
                questionList.wait();
            }
        }

        synchronized (questionList) {
            Thread.sleep(5000);
            System.out.println("Answered question: " + questionList.remove(0));
            // For any thread that is waiting for (questionList) will be notified
            questionList.notify();
        }

    }

    @Override
    public void run() {
        while(true) {
            try {
                answerQuestion();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


package com.elvislee.producerconsumer;

import java.util.List;

public class Producer implements Runnable{
    List<Integer> questionList = null;
    final int LIMIT = 5;
    private int questionNo;

    public Producer(List<Integer> questionList) {
        this.questionList = questionList;
    }

    public void readQuestion(int questionNo) throws InterruptedException {
        synchronized (questionList) {
            while(questionList.size() == LIMIT) {
                System.out.println("Questions have piled up, wait for answers");
                // Let thread wait for another thread to call .notify()
                questionList.wait();
            }
        }

        synchronized (questionList) {
            System.out.println("New question: " + questionNo);
            questionList.add(questionNo);
            Thread.sleep(100);
            // For any thread that is waiting for (questionList) will be notified
            questionList.notify();
        }

    }

    @Override
    public void run() {
        while(true) {
            try {
                readQuestion(questionNo++);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

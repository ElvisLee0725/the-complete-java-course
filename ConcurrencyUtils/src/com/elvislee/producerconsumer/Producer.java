package com.elvislee.producerconsumer;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
    BlockingQueue<Integer> questionQueue;
    int questionNo = 0;

    public Producer(BlockingQueue<Integer> queue) {
        this.questionQueue = queue;
    }

    @Override
    public void run() {
        while(true) {
            try {
                synchronized (this) {
                    int nextQuestion = questionNo++;
                    System.out.println("Get next Question: " + nextQuestion);
                    questionQueue.put(nextQuestion);    // Use .put() to add to queue
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

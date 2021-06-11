package com.elvislee.producerconsumer;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

    BlockingQueue<Integer> questionQueue;

    public Consumer(BlockingQueue<Integer> queue) {
        this.questionQueue = queue;
    }

    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(1000);
                // .take() Retrieve and remove one from the head of queue
                System.out.println("Answered question: " + questionQueue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

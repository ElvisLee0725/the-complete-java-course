package com.elvislee.threadpools;

public class MessageProcessor implements Runnable {
    int message;

    public MessageProcessor(int message) {
        this.message = message;
    }


    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " [Received] Message: " + message);
        respondToMessage();  // make thread sleep to simulate response
        System.out.println(Thread.currentThread().getName() + " (DONE) Processing Message: " + message);
    }

    private void respondToMessage() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Unable to process message: " + message);
        }
    }
}

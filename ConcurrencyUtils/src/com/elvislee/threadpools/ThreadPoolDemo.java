package com.elvislee.threadpools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolDemo {
    public static void main(String[] args) {
        // The argument is the number of threads we want it to use
        // Once a thread has done its job, it will be recycled and run next task
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Runnable processor = new MessageProcessor(2);
        executor.execute(processor);

        Runnable processor2 = new MessageProcessor(3);
        executor.execute(processor2);

        Runnable processor3 = new MessageProcessor(4);
        executor.execute(processor3);

        Runnable processor4 = new MessageProcessor(5);
        executor.execute(processor4);

        // Need to stop the executor gracefully
        executor.shutdown();

        // To make sure printing "submitted" at the end, use this to prevent it from printing
//        while(!executor.isTerminated()) {
//
//        }

        // This can also let executor wait before running to the end
        try {
            executor.awaitTermination(10, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Submitted all tasks...");
    }
}

package com.elvislee.threading;

public class Application {

    public static void main(String[] args) {
        System.out.println("Run task 1...");
        Thread t1 = new Thread(new Task("Thread - A"));
        t1.start();

        System.out.println("Run task 2...");
        Thread t2 = new Thread(new Task("Thread - B"));
        t2.start();
    }
}

class Task implements Runnable {
    String name;
    public Task(String name) {
        this.name = name;
    }

    public void run() {
        Thread.currentThread().setName(this.name);
        for(int i = 0; i < 100; i++) {
            System.out.println("Number: " + i + " - " + Thread.currentThread().getName());
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

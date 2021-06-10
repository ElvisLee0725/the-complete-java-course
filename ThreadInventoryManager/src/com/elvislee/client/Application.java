package com.elvislee.client;

import com.elvislee.inventory.InventoryManager;

public class Application {
    public static void main(String[] args) throws InterruptedException {
        InventoryManager manager = new InventoryManager();
        Thread inventoryTask = new Thread(new Runnable() {
            @Override
            public void run() {
                manager.populateSoldProduct();
            }
        });

        Thread displayTask = new Thread(new Runnable() {
            @Override
            public void run() {
                manager.displaySoldProduct();
            }
        });

        inventoryTask.start();
        // Asking the main thread to wait for inventoryTask to join! Main thread is this main()
        // inventoryTask.join();
        Thread.sleep(2000);
        displayTask.start();
    }
}

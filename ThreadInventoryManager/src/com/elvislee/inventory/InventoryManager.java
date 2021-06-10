package com.elvislee.inventory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventoryManager {
    List<Product> soldProductList = new CopyOnWriteArrayList<>();
    List<Product> purchaseProductList = new ArrayList();

    public void populateSoldProduct() {
        for(int i = 0; i < 1000; i++) {
            Product prod = new Product(i, "test_product_" + i);
            soldProductList.add(prod);
            System.out.println(prod);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void displaySoldProduct() {
        for(Product p : soldProductList) {
            System.out.println("SOLD: " + p);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

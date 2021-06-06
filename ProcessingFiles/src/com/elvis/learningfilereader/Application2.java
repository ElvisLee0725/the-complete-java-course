package com.elvis.learningfilereader;

class MyClass implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("Closing my class.");
    }
}
public class Application2 {
    public static void main(String[] args) {
        try(MyClass mc = new MyClass();) {

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

}

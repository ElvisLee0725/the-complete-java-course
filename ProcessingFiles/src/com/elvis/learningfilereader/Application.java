package com.elvis.learningfilereader;

import java.io.*;

public class Application {
    public static void main(String[] args) {
        File file = new File("myfile.txt");

        // This is AutoCloseable, included in Java 7 and later
        try(FileReader fileReader =  new FileReader(file);
            BufferedReader br = new BufferedReader(fileReader);) {

            String line = br.readLine();
            while(line != null) {
                System.out.println(line);
                line = br.readLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

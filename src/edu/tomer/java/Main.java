package edu.tomer.java;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        FileReader reader = null;

        try {
            StringBuilder builder = new StringBuilder();
            reader = new FileReader("1.txt");

            int read = -1;

            while ((read = reader.read()) != -1) {
                char c = (char) read;
                builder.append(c);
            }
            System.out.println(builder.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

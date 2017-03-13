package edu.tomer.java;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        BufferedReader reader = null;

        try {
            StringBuilder builder = new StringBuilder();

            reader = new BufferedReader(new FileReader("1.txt"));
            String line = null;
            while ((line = reader.readLine()) != null) {
                builder.append(line);
            }
            System.out.println(builder.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //TODO: close the stream.
        }

    }
}

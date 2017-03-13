package edu.tomer.java;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by hackeru on 13/03/2017.
 */
public class FileIO {
    public static void write(String file, String data){
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
            fileWriter.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

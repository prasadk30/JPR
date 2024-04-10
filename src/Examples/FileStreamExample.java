package Examples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamExample {
    public static void main(String[] args) {
        // Define file paths
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        // Write data to a file using FileOutputStream
        try (FileOutputStream outputStream = new FileOutputStream(inputFile)) {
            String data = "Hello, this is input.txt!";
            outputStream.write(data.getBytes());
            System.out.println("Data has been written to input.txt.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to file: " + e.getMessage());
        }

        // Read data from the file using FileInputStream and write it to another file
        try (FileInputStream inputStream = new FileInputStream(inputFile);
             FileOutputStream outputStream = new FileOutputStream(outputFile)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
            System.out.println("Data has been successfully copied from input.txt to output.txt.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading/writing files: " + e.getMessage());
        }
    }

}

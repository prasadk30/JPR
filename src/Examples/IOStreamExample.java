package Examples;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOStreamExample {
    public static void main(String[] args) {
        // Define file paths
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        // Write data to a file
        try (FileWriter writer = new FileWriter(inputFile)) {
            writer.write("Hello, this is input.txt!");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to file: " + e.getMessage());
        }

        // Read data from the file and write it to another file
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Data has been successfully copied from input.txt to output.txt.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading/writing files: " + e.getMessage());
        }
    }

}

import java.io.*;
import java.util.*;

public class WordCount {

    public static void main(String[] args) {
        // File path for the text file
        String fileName = "words.txt";
        int wordCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;

            // Read each line of the file
            while ((line = br.readLine()) != null) {
                // Split the line into words using a regular expression that splits by whitespace
                String[] words = line.split("\\s+");
                wordCount += words.length; // Add the number of words in the line to the total count
            }

            System.out.println("Total number of words in " + fileName + ": " + wordCount);

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}


import java.io.*;

public class FileRead {

    public static void main(String[] args) {
        try {
            // Create FileReader and BufferedReader to read the file
            FileReader file = new FileReader("data.txt");
            BufferedReader reader = new BufferedReader(file);

            String line;
            // Read each line and print to console
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // Close the reader
            reader.close();
        } catch (IOException e) {
            // Handle exceptions
            System.out.println("Error reading the file.");
            e.printStackTrace();
        }
    }
}


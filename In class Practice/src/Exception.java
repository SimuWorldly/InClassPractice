import java.io.*;

public class Exception{

    public static void main(String[] args) {
        // Attempt to open and read the file
        try {
            // Try to open the file for reading
            FileReader file = new FileReader("example.txt");
            BufferedReader reader = new BufferedReader(file);

            String line;
            // Read each line from the file
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // Close the reader
            reader.close();
        } catch (FileNotFoundException e) {
            // Handle the case where the file is not found
            System.out.println("Oops! The file 'example.txt' was not found. Please check the file path.");
        } catch (IOException e) {
            // Handle other IOExceptions
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}


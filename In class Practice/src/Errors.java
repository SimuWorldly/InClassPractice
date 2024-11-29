import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Errors {

    public static void main(String[] args) {
        try {
            // Simulate division by zero (ArithmeticException)
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            // Get the current timestamp
            String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());

            // Log the error details to a file
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("errorLog.txt", true))) {
                // Write the timestamp and error details to the log file
                writer.write("Timestamp: " + timestamp);
                writer.newLine();
                writer.write("Error: " + e.toString());
                writer.newLine();
                writer.newLine(); // Add an empty line between log entries
            } catch (IOException ioException) {
                System.out.println("An error occurred while logging the error details.");
                ioException.printStackTrace();
            }
        }
    }
}


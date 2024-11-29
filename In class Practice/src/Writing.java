import java.io.*;
import java.util.Scanner;

public class Writing {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name and email
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        // Write the name and email to a file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("userInfo.txt", true))) {
            // Write each entry on a new line
            writer.write("Name: " + name);
            writer.newLine();
            writer.write("Email: " + email);
            writer.newLine();
            writer.newLine(); // Add an extra new line for separation

            System.out.println("Your information has been saved to 'userInfo.txt'.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        } finally {
            // Close the scanner
            scanner.close();
        }
    }
}


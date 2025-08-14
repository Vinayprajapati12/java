package endOfJava;

import java.io.File;               // For file operations like create, delete
import java.io.FileNotFoundException; // For handling file not found errors
import java.io.FileWriter;         // For writing data into a file
import java.io.IOException;        // For handling input/output exceptions
import java.util.Scanner;          // For reading from a file

public class fileHandling {
    public static void main(String[] args) {

        // ---------------- 1. CREATE A NEW FILE ----------------
        /*
        File myFile = new File("111file.txt"); // Create File object pointing to "111file.txt"
        try {
            // createNewFile() creates the file if it doesn't exist
            if (myFile.createNewFile()) {
                System.out.println("File created: " + myFile.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) { // Catch any file creation errors
            System.out.println("Unable to create this file");
            e.printStackTrace();
        }
        */

        // ---------------- 2. WRITE TO A FILE ----------------
        /*
        try {
            // FileWriter is used to write text into a file
            FileWriter fileWriter = new FileWriter("111file.txt");
            // Writing content into the file
            fileWriter.write("This is our first file from this Java course\nOk now bye");
            fileWriter.close(); // Always close after writing
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) { // Handle writing errors
            e.printStackTrace();
        }
        */

        // ---------------- 3. READ FROM A FILE ----------------
        /*
        File myFile = new File("111file.txt"); // File object pointing to "111file.txt"
        try {
            Scanner sc = new Scanner(myFile); // Scanner reads from the file
            while (sc.hasNextLine()) {        // Loop until no more lines
                String line = sc.nextLine(); // Read one line at a time
                System.out.println(line);    // Print the line
            }
            sc.close(); // Close scanner
        } catch (FileNotFoundException e) { // Handle missing file errors
            e.printStackTrace();
        }
        */

        // ---------------- 4. DELETE A FILE ----------------
        /*
        File myFile = new File("111file.txt"); // File object pointing to "111file.txt"
        if (myFile.delete()) { // delete() returns true if file is deleted
            System.out.println("I have deleted: " + myFile.getName());
        } else {
            System.out.println("Some problem occurred while deleting the file");
        }
        */

    }
}

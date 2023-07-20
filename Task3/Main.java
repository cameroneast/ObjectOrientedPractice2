import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Read the "input.txt" file
        File file = new File("input.txt");

        // Initialize counts
        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                lineCount++;

                // Count characters in the line
                charCount += line.length();

                // Count words in the line
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }

            scanner.close();

            // Display the counts on the console
            System.out.println("Number of lines: " + lineCount);
            System.out.println("Number of words: " + wordCount);
            System.out.println("Number of characters: " + charCount);

        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        }
    }
}

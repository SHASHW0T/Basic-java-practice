import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyCharacterStreams {
    public static void main(String[] args) {
        // Input and output file paths
        String inputFile = "input.txt"; // Replace with your input file path
        String outputFile = "output.txt"; // Replace with your output file path

        try {
            // Create BufferedReader to read from the input file
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));

            // Create BufferedWriter to write to the output file
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

            // Buffer to hold characters read from the input file
            char[] buffer = new char[1024];
            int charsRead;

            // Read from the input file and write to the output file
            while ((charsRead = reader.read(buffer)) != -1) {
                writer.write(buffer, 0, charsRead);
            }

            // Close streams
            reader.close();
            writer.close();

            System.out.println("File copied successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

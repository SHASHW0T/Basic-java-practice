import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyByteStreams {
    public static void main(String[] args) {
        // Input and output file paths
        String inputFile = "input.txt"; // Replace with your input file path
        String outputFile = "output.txt"; // Replace with your output file path

        try {
            // Create FileInputStream to read from the input file
            FileInputStream inputStream = new FileInputStream(inputFile);

            // Create FileOutputStream to write to the output file
            FileOutputStream outputStream = new FileOutputStream(outputFile);

            // Buffer to hold bytes read from the input file
            byte[] buffer = new byte[1024];
            int bytesRead;

            // Read from the input file and write to the output file
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

            // Close streams
            inputStream.close();
            outputStream.close();

            System.out.println("File copied successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

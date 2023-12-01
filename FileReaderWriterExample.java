import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class FileReaderWriterExample {
    public static void main(String[] args) {
        // File path
        String filePath = "input.txt"; // Replace with your file path

        try {
            // Create a FileReader to read from the file
            Reader reader = new FileReader(filePath);

            // Create a StringBuilder to store the file content
            StringBuilder fileContent = new StringBuilder();

            // Read characters from the file
            int charRead;
            while ((charRead = reader.read()) != -1) {
                fileContent.append((char) charRead);
            }

            // Close the reader
            reader.close();

            // Display the file content
            System.out.println("File content:");
            System.out.println(fileContent.toString());

            // If you want to write the content back to another file (optional)
            String outputFilePath = "output.txt"; // Replace with your output file path
            Writer writer = new FileWriter(outputFilePath);
            writer.write(fileContent.toString());
            writer.close();
            System.out.println("File content written to output file successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

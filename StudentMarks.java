import java.sql.*;

public class StudentMarks {
    public static void main(String[] args) {
        try {
            // Step 1: Load the JDBC driver
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

            // Step 2: Establish the connection with MS Access database
            String dbURL = "jdbc:ucanaccess://C:/path/to/your/database.accdb";
            Connection connection = DriverManager.getConnection(dbURL);

            // Step 3: Create a SQL statement
            Statement statement = connection.createStatement();

            // Step 4: Execute the query to get student marks
            String query = "SELECT * FROM StudentMarks";
            ResultSet resultSet = statement.executeQuery(query);

            // Step 5: Display student marks
            System.out.println("Student Marks:");
            System.out.println("ID\tName\tSubject\tMarks");
            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String name = resultSet.getString("Name");
                String subject = resultSet.getString("Subject");
                int marks = resultSet.getInt("Marks");
                System.out.println(id + "\t" + name + "\t" + subject + "\t" + marks);
            }

            // Step 6: Close the connections
            resultSet.close();
            statement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}

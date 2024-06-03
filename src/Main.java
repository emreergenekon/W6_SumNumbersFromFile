import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // İnteger to save the total number
        int total = 0;

        // Finding the path
        String filePath = "numbers.txt";

        // BufferedReader using to read the file
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            // Read till the end
            while ((line = br.readLine()) != null) {
                // Changing to integer
                total += Integer.parseInt(line);
            }
        } catch (IOException e) {
            // Finding IOException error and printing
            e.printStackTrace();
        }

        // Print total again
        System.out.println("Toplam: " + total);
    }
}

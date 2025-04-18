import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class Que8 {
    public static void main(String[] args) {
        try {
            // Writing to a file
            FileWriter writer = new FileWriter("myfile41.txt");
            writer.write("This is Java File Handling.");
            writer.close();
            System.out.println("File successfully written.");

            // Reading from the file
            FileReader reader = new FileReader("myfile41.txt");
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            reader.close();

        } catch (IOException e) {
            System.out.println("An error has occurred: " + e.getMessage());
        }
    }
}

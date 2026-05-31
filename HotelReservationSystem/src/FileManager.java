import java.io.FileWriter;
import java.io.IOException;

public class FileManager {

    public static void saveData(String data) {

        try {

            FileWriter writer =
                    new FileWriter("hotel_bookings.txt");

            writer.write(data);

            writer.close();

            System.out.println("Data Saved Successfully!");

        } catch (IOException e) {

            System.out.println("Error Saving File.");
        }
    }
}
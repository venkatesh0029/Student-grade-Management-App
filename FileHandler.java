import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileHandler {
    public static void saveToFile(List<String[]> students) {
        try (FileWriter writer = new FileWriter("grades.txt")) {
            for (String[] student : students) {
                writer.write(student[0] + "," + student[1] + "," + student[2] + "\n");
            }
            System.out.println("Data saved to grades.txt");
        } catch (IOException e) {
            System.out.println("Error saving file.");
        }
    }
}

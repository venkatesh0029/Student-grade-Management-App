import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputHandler {
    public static List<String[]> getStudentData(Scanner scanner) {
        List<String[]> students = new ArrayList<>();
        System.out.print("Enter number of students: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < num; i++) {
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();
            System.out.print("Enter student marks: ");
            int marks = scanner.nextInt();
            scanner.nextLine();
            students.add(new String[]{name, String.valueOf(marks), ""});
        }
        return students;
    }
}

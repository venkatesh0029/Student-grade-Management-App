import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get student data
        List<String[]> students = InputHandler.getStudentData(scanner);

        // Calculate grades
        for (String[] student : students) {
            student[2] = GradeCalculator.calculateGrade(Integer.parseInt(student[1]));
        }

        // Save to file
        FileHandler.saveToFile(students);

        // Display results
        Display.showResults(students);
    }
}

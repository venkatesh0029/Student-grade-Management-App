import java.util.List;

public class Display {
    public static void showResults(List<String[]> students) {
        System.out.println("\nStudent Grades:");
        System.out.println("----------------------");
        System.out.printf("%-15s %-10s %-5s%n", "Name", "Marks", "Grade");
        System.out.println("----------------------");

        for (String[] student : students) {
            System.out.printf("%-15s %-10s %-5s%n", student[0], student[1], student[2]);
        }
    }
}

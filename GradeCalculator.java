public class GradeCalculator {
    public static String calculateGrade(int marks) {
        if (marks >= 90)
            return "A+";
        if (marks >= 80)
            return "A";
        if (marks >= 70)
            return "B";
        if (marks >= 60)
            return "C";
        if (marks >= 50)
            return "D";
        return "F";
    }
}

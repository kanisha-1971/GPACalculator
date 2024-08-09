import java.util.ArrayList;
import java.util.Scanner;

class Course {
    String code;
    String name;
    int credits;
    double marks;

    Course(String code, String name, int credits, double marks) {
        this.code = code;
        this.name = name;
        this.credits = credits;
        this.marks = marks;
    }

    double getPoints() {
        if (marks >= 90) return 4.0;
        if (marks >= 85) return 3.7;
        if (marks >= 80) return 3.5;
        if (marks >= 77) return 3.3;
        if (marks >= 73) return 3.0;
        if (marks >= 70) return 2.7;
        if (marks >= 65) return 2.5;
        if (marks >= 60) return 2.0;
        if (marks >= 55) return 1.5;
        if (marks >= 50) return 1.0;
        return 0.0;
    }
}

public class GPACalculator {

    public static void main(String[] args) {
        ArrayList<Course> courses = new ArrayList<>();

        // Launch Screen
        System.out.println("*********************************");
        System.out.println("*        GPA Calculator         *");
        System.out.println("*  Developer: Radhika Ajmeri    *");
        System.out.println("*     Student ID: A00192576     *");
        System.out.println("*    Development Date: 4-8-24   *");
        System.out.println("*********************************");
        System.out.println("Instructions:");
        System.out.println("1. Enter the course details when prompted.");
        System.out.println("2. Enter 'Y' to add more courses, 'N' to calculate GPA.");
        System.out.println("3. Follow prompts for each course.");
        System.out.println("***********************");

        // Using try-with-resources to ensure Scanner is closed
        try (Scanner scanner = new Scanner(System.in)) {
            // Course Details Input and Additional Course Query
            while (true) {
                System.out.print("Enter course code: ");
                String code = scanner.nextLine();

                System.out.print("Enter course name: ");
                String name = scanner.nextLine();

                System.out.print("Enter credits for " + code + ": ");
                int credits = Integer.parseInt(scanner.nextLine());

                System.out.print("Enter marks for " + code + ": ");
                double marks = Double.parseDouble(scanner.nextLine());

                courses.add(new Course(code, name, credits, marks));

                System.out.print("Do you want to add another course? (Y/N): ");
                String choice = scanner.nextLine();
                if (!choice.equalsIgnoreCase("Y")) {
                    break;
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter numeric values for credits and marks.");
        }

        // GPA Calculation Output
        double totalCredits = 0;
        double totalPoints = 0;

        System.out.println("\nCourse Details:");
        System.out.printf("%-10s %-20s %-10s %-10s %-10s\n", "Code", "Name", "Credits", "Marks", "Points");
        for (Course course : courses) {
            double points = course.getPoints();
            totalCredits += course.credits;
            totalPoints += points * course.credits;
            System.out.printf("%-10s %-20s %-10d %-10.2f %-10.2f\n", course.code, course.name, course.credits, course.marks, points);
        }

        double gpa = totalPoints / totalCredits;
        System.out.printf("\nYour GPA is: %.2f\n", gpa);
    }
}
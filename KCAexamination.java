import java.util.Scanner;

public class KCAexamination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double ass1, ass2, ass3, cat1, cat2;
        double finalExam = 0;

        do {
            Menu();
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    viewCourseworkResults();
                    break;
                case 2:
                    viewExamResults(finalExam);
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);
    }

    private static void Menu() {
        System.out.println("Choose an operation:");
        System.out.println("1. View Coursework Results");
        System.out.println("2. View Exam Results");
        System.out.println("3. Exit");
    }

    private static void viewCourseworkResults() {
        Scanner scanner = new Scanner(System.in);
        double ass1, ass2, ass3, cat1, cat2;
        double coursework;

        System.out.println("Enter assessment 1 result:");
        ass1 = scanner.nextDouble();
        System.out.println("Enter assessment 2 result:");
        ass2 = scanner.nextDouble();
        System.out.println("Enter assessment 3 result:");
        ass3 = scanner.nextDouble();
        System.out.println("Enter cat 1 result:");
        cat1 = scanner.nextDouble();
        System.out.println("Enter cat 2 result:");
        cat2 = scanner.nextDouble();

        coursework = ass1 + ass2 + ass3 + cat1 + cat2;
        System.out.println("Coursework results: " + coursework);

        int assessmentCount = countAssessments();
        System.out.println("Number of coursework assessments: " + assessmentCount);

        if (!isEligibleToRepeat(assessmentCount)) {
            System.out.println(" All assessments done.");
        }
        }
    private static int countAssessments() {
        int count = 0;
        for (int i = 0; i < 5; i++) {
            count++;
        }
        return count;
    }

    private static boolean isEligibleToRepeat(int assessmentCount) {
        double requiredAssessments = 2.0 / 3.0 * assessmentCount;
        return assessmentCount < requiredAssessments;
    }

    private static void viewExamResults(double finalExam) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter final exam result:");
        finalExam = scanner.nextDouble();
        System.out.println("Final exam result: " + finalExam);

        double coursework = calculateCoursework();
        double totalScore = finalExam + coursework;
        System.out.println("Total score: " + totalScore);
    }

    private static double calculateCoursework() {
        Scanner scanner = new Scanner(System.in);
        double ass1, ass2, ass3, cat1, cat2;

        System.out.println("Enter assessment 1 result:");
        ass1 = scanner.nextDouble();
        System.out.println("Enter assessment 2 result:");
        ass2 = scanner.nextDouble();
        System.out.println("Enter assessment 3 result:");
        ass3 = scanner.nextDouble();
        System.out.println("Enter cat 1 result:");
        cat1 = scanner.nextDouble();
        System.out.println("Enter cat 2 result:");
        cat2 = scanner.nextDouble();

        return ass1 + ass2 + ass3 + cat1 + cat2;
    }
}


package Question1;

import java.util.Scanner;

public class QuizGrader {
    public static void main(String[] args) {
        int num_quiz; // number of questions on the quiz
        int to_grade;
        int count;
        double total;

        Scanner scan = new Scanner(System.in);

        System.out.print("How many questions are in the quiz? ");
        num_quiz = scan.nextInt();

        int[] answers = new int[num_quiz];

        System.out.println("Enter the answer keys for the questions.");

        for (int i = 0; i < answers.length; i++) {
            answers[i] = scan.nextInt();
        }

        boolean gradeAnotherQuiz = true;
        while (gradeAnotherQuiz) {
            count = 0;

            System.out.println("Enter the answers for the quiz to be graded: ");

            for (int i = 0; i < answers.length; i++) {
                to_grade = scan.nextInt();

                if (to_grade == answers[i]) {
                    count++;
                }
            }

            total = (double) count / num_quiz * 100;

            System.out.println("The number of questions correct are: " + count);
            System.out.println("The percentage correct is: " + total);

            System.out.print("Grade another Quiz? (y/n) ");
            String input = scan.next();
            if (!input.equalsIgnoreCase("y")) {
                gradeAnotherQuiz = false;
            }
        }
    }
}

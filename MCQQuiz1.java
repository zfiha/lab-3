import java.util.Scanner;

public class MCQQuiz1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                String[] questions = {
            "What is the capital of Bangladesh?",
            "In which year did Bangladesh gain independence??",
            "Which traditional Bengali sweet is most famous in Bangladesh?'?",
            "What is the largest mammal on Earth?",
            "Which element has the chemical symbol 'O'?"
        };

               String[][] options = {
            {"A. Dhaka", "B. Chittagong", "C. Khulna", "D. Sylhet"},
            {"A.1947", "B.1971 ", "C.1965 ", "D.1990 "},
            {"A.Gulab Jamun ", "B.Sondesh ", "C.Rosogolla ", "D.Mishti Doi "},
            {"A. Elephant", "B. Blue Whale", "C. Giraffe", "D. Hippopotamus"},
            {"A. Oxygen", "B. Hydrogen", "C. Nitrogen", "D. Helium"}
        };

          char[] answers = {'A', 'B', 'D', 'B', 'A'};
        
        int score = 0;

             for (int i = 0; i < questions.length; i++) {
            System.out.println((i + 1) + ". " + questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }
            System.out.print("Enter your answer (A, B, C, or D): ");
            char userAnswer = scanner.next().toUpperCase().charAt(0);

            if (userAnswer == answers[i]) {
                System.out.println("Correct!\n");
                score += 5;
            } else {
                System.out.println("Wrong! The correct answer is " + answers[i] + ".\n");
                score -= 1;
            }
        }

                System.out.println("You scored " + score + " out of " + (questions.length ) + ".");
        scanner.close();
    }
}
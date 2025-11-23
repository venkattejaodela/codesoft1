import java.util.*;
public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Number Guessing Game");
        int ts = 0;
        String cgInput = "yes";
        while (cgInput.equals("yes")) {
            int attempts = 0;
            int maxAttemps = 5;
            boolean guessRight = false;
            int num = (int)(Math.random() * 100) + 1;
            System.out.println("The computer has generated a random number");
            System.out.println("You have " + maxAttemps + " attempts to guess it");
            while (attempts < maxAttemps && guessRight == false) {
                System.out.println("Enter your guess: ");
                int Guess = sc.nextInt();
                attempts++;
                if (Guess == num) {
                    System.out.println("Correct! You have guessed it in " + attempts + " attempts");
                    guessRight = true;
                    int roundScore = (maxAttemps - attempts + 1) * 10;
                    ts += roundScore;
                    break;
                } else if (Guess > num) {
                    if (Guess - num >= 20) {
                        System.out.println("Too high! Try again");
                    } else if (Guess - num < 20) {
                        System.out.println("A Bit High! Try again");
                    }
                } else {
                    if (num - Guess >= 20) {
                        System.out.println("Too Low! Try again");
                    } else if (num - Guess < 20) {
                        System.out.println("A Bit Low! Try again");
                    }
                }
            }
            if (guessRight == false) {
                System.out.println("Haha! u are out of attempts.\nThe number was " + num);
            }
            System.out.println("Hey i gotttu\nYour score is: " + ts);
            System.out.println("Wanna play again ?\n(yes/no)");
            sc.nextLine();
            cgInput = sc.nextLine();
            if (cgInput.equals("yes")) {
                cgInput = "yes";
            } else {
                cgInput = "no";
            }
        }
        System.out.println("I know u liked it.\nThanks for playing!\nYour score is : " + ts);
        sc.close();
    }
}

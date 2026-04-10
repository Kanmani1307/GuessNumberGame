import java.util.*;

public class GuessNumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int totalScore = 0;
        int rounds;

        System.out.print("Enter number of rounds: ");
        rounds = sc.nextInt();

        for (int i = 1; i <= rounds; i++) {
            int number = rand.nextInt(100) + 1; // 1 to 100
            int attempts = 5;
            int guess;
            boolean won = false;

            System.out.println("\n--- Round " + i + " ---");
            System.out.println("Guess the number between 1 and 100");

            while (attempts > 0) {
                System.out.print("Enter your guess: ");
                guess = sc.nextInt();

                if (guess == number) {
                    System.out.println("🎉 Correct! You guessed the number.");
                    totalScore += attempts * 10; // scoring
                    won = true;
                    break;
                } else if (guess < number) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }

                attempts--;
                System.out.println("Attempts left: " + attempts);
            }

            if (!won) {
                System.out.println("❌ You lost! The number was: " + number);
            }
        }

        System.out.println("\n🏁 Game Over!");
        System.out.println("Your Total Score: " + totalScore);
    }
}

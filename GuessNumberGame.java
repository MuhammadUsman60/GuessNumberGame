import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int maxRange = 100;
        int minRange = 1;
        int score = 0;
        int maxAttempts = 3;
        int rounds = 0;

        boolean playGame = true;
        while (playGame) {
            int generateNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            int attempts = 0;
            while (attempts < maxAttempts) {
                int number;
                do {
                    System.out.println("Enter any number between 1 to 100");
                    number = sc.nextInt();
                } while (number < 1 || number > 100);
                if (number > generateNumber) {
                    System.out.println("Your number is too high");
                } else if (number < generateNumber) {
                    System.out.println("Your number is too low");
                } else {
                    System.out.println("Your number is correct");
                    score++;

                }
                attempts++;
            }

            rounds++;
            System.out.println("Do you want plan Again this game to print yes/no");
            sc.nextLine();
            String play = sc.nextLine();
            if (play.equals("yes")) {
                if (rounds >= maxAttempts) {
                    System.out.println("Sorry you used attempts");
                    playGame = false;
                }
            } else {
                playGame = false;
            }

        }


        System.out.println("Game over! Your Sorce is " + score + " Out of " + rounds);


    }
}
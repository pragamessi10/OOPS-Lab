Program:


import java.util.Random;
import java.util.Scanner;

class DiceGame {
    Random random = new Random();
    Scanner sc = new Scanner(System.in);

    // Method to roll the dice
    int rollDice() {
        return random.nextInt(6) + 1;
    }

    // Method to play the game
    void playGame() {
        String choice;

        do {
            System.out.println("\n--- DICE ROLLING CHALLENGE ---");
            System.out.print("Press Enter to roll your dice...");
            sc.nextLine();

            int player = rollDice();
            int computer = rollDice();

            System.out.println("Your dice: " + player);
            System.out.println("Computer dice: " + computer);

            if (player > computer) {
                System.out.println("Congratulations! You win!");
            } else if (player < computer) {
                System.out.println("Computer wins! Try again.");
            } else {
                System.out.println("It's a draw!");
            }

            System.out.print("Play again? (yes/no): ");
            choice = sc.nextLine();

        } while (choice.equalsIgnoreCase("yes"));

        System.out.println("Thanks for playing!");
        sc.close();
    }

    public static void main(String[] args) {
        DiceGame game = new DiceGame();
        game.playGame();
    }
}






Sample Output:


--- DICE ROLLING CHALLENGE ---
Press Enter to roll your dice...
Your dice: 5
Computer dice: 3
Congratulations! You win!
Play again? (yes/no): yes

--- DICE ROLLING CHALLENGE ---
Press Enter to roll your dice...
Your dice: 2
Computer dice: 6
Computer wins! Try again.
Play again? (yes/no): no
Thanks for playing!

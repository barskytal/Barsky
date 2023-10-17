// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int playerScore = 0;
            int computerScore = 0;

            while (true) {
                System.out.println("Do you want to play: rock, paper, or scissors? or 'quit' to exit:");
                String playerChoice = scanner.nextLine().toLowerCase();

                if (playerChoice.equals("quit")) {
                    break;
                }

                String[] choices = {"rock", "paper", "scissors"};
                int randomIndex = (int) (Math.random() * 3);
                String computerChoice = choices[randomIndex];

                System.out.println("Computer's choice: " + computerChoice);

                if (playerChoice.equals(computerChoice)) {
                    System.out.println("It's a tie!");
                } else if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                        (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                        (playerChoice.equals("scissors") && computerChoice.equals("paper"))) {
                    System.out.println("You win!");
                    playerScore++;
                } else {
                    System.out.println("Computer wins!");
                    computerScore++;
                }

                System.out.println("Player Score: " + playerScore);
                System.out.println("Computer Score: " + computerScore);
            }

            System.out.println("Thanks for playing!");
        }
    }

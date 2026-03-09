import java.util.Scanner;
import java.util.Random;

public class RPS_Game {
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
 
        String[] choices = {"Rock", "Paper", "Scissors"};
 
        try {
 
            System.out.println("Rock Paper Scissors Game");
            System.out.println("1 - Rock");
            System.out.println("2 - Paper");
            System.out.println("3 - Scissors");
 
            System.out.print("Enter your choice (1-3): ");
            int userChoice = scanner.nextInt();
 
            if (userChoice < 1 || userChoice > 3) {
                throw new Exception("Invalid Choice! Please enter 1, 2 or 3.");
            }
 
            int computerChoice = random.nextInt(3) + 1;
 
            System.out.println("You chose: " + choices[userChoice - 1]);
            System.out.println("Computer chose: " + choices[computerChoice - 1]);
 
            if (userChoice == computerChoice) {
                System.out.println("Result: Draw");
            }
            else if ((userChoice == 1 && computerChoice == 3) ||
                     (userChoice == 2 && computerChoice == 1) ||
                     (userChoice == 3 && computerChoice == 2)) {
 
                System.out.println("Result: You Win!");
            }
            else {
                System.out.println("Result: Computer Wins!");
            }
 
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
 
        scanner.close();
    }
}


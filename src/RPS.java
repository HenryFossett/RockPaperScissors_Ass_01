import java.util.Scanner;

public class RPS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String playerA = "";
        String playerB = "";
        String playAgain = "";
        boolean doneA = false;
        boolean doneB = false;
        boolean done = false;
        do{
            do {
                System.out.print("Player A, enter your move [R/P/S]: ");
                playerA = in.nextLine();
                if (playerA.equals("R") || playerA.equals("P") || playerA.equals("S")) {
                    doneA = true;
                } else {
                    System.out.println("Please only enter a valid R/P/S move");
                }
            } while (!doneA);
            do {
                System.out.print("Player B, enter your move [R/P/S]: ");
                playerB = in.nextLine();
                if (playerB.equals("R") || playerB.equals("P") || playerB.equals("S")) {
                    doneB = true;
                } else {
                    System.out.println("Please only enter a valid R/P/S move");
                }
            } while(!doneB);
            if(playerA.equals("R")){
                if (playerB.equals("R")){
                    System.out.println("Rock and Rock, its a tie!");
                }else if (playerB.equals("P")) {
                    System.out.println("Paper covers Rock, Player B wins!");
                } else {
                    System.out.println("Rock crushes Scissors, Player A wins!");
                }
            }
            if(playerA.equals("P")){
                if (playerB.equals("R")){
                    System.out.println("Paper covers Rock, player A wins!");
                }else if (playerB.equals("P")) {
                    System.out.println("Paper and Paper, its a tie!");
                } else {
                    System.out.println("Scissors cut Paper, Player B wins!");
                }
            }
            if(playerA.equals("S")){
                if (playerB.equals("R")){
                    System.out.println("Rock crushes Scissors, Player B wins!");
                }else if (playerB.equals("P")) {
                    System.out.println("Scissors cut Paper, Player A wins!");
                } else {
                    System.out.println("Scissors and Scissors, its a tie!");
                }
            }
            System.out.print("Do you want to play again? [Y/N]: ");
            playAgain = in.nextLine();
            if (playAgain.equals("N")){
                done = true;
                System.out.println("Thank you for playing!");
            } 
        }while(!done);
    }
}

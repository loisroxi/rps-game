import java.util.*;
import javax.swing.*;

public class RockPaperScissors {

    /*User Story Front ID: 1
    +--------------------------------------------------+
    |
    | Title: Waste an Hour Having Fun
    |
    | As a frequent games player,
    | I'd like to play rock, paper, Scissors
    | so that I can spend an hour of my day having fun
    |
    | Acceptance Criteria
    |  - 1.1 I can play Player vs Computer
    |  - 1.2 I can play Computer vs Computer
    |  - 1.3 I can play a different game each time
    |
    |
    +--------------------------------------------------+

    User Story Back ID: 2
    +--------------------------------------------------+
    |
    |
    |
    | Technical Constraints
    |
    | - Doesn't necessarily need a flashy GUI
    |   (can be simple)
    | - Use Java or any other object-oriented language
    | - Libs / external modules should only be used
    |   for tests
    | - Using agile engineering
    |   practices
    |
    |
    |
    +--------------------------------------------------+
     */
    public static void main(String[] args) {


        //1.3 I can play a different game each time
        chooseGameMethod();

        //2.2 Implement tests

        //2.3 Ensure agile engineering practices


    }

    //1.3.1 Implement choosing menu
    //2.1 Implement GUI
    public static void chooseGameMethod() {

        String[] options = {"Player vs Computer", "Computer vs Computer", "Exit"};
        int gameMode = JOptionPane.showOptionDialog(null, "Please choose the desired game method:",
                "Game Selection", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, options, options[0]);

        if (gameMode == 0) {
            playPlayerVsComputer();
        } else if (gameMode == 1) {
            playComputerVsComputer();
        } else if (gameMode == 2) {
            return; // Exit the program
        }
    }

    //1.1 I can play Player vs Computer
    public static void playPlayerVsComputer() {

        String[] moves = {"Rock", "Paper", "Scissors"};
        int moveChoice = JOptionPane.showOptionDialog(null, "Choose your move:",
                "Player vs Computer", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, moves, moves[0]);

        if (moveChoice != JOptionPane.CLOSED_OPTION) {
            String playerDecision = moves[moveChoice];
            String computerDecision = generateComputerDecision();
            String winner = determineWinner("You", "Computer", playerDecision, computerDecision);
            JOptionPane.showMessageDialog(null, "You chose: " + playerDecision +
                    "\nComputer chose: " + computerDecision +
                    "\nResult: " + winner);
        }
        chooseGameMethod();
    }

    //1.2.1 Implement Computer vs Computer
    public static void playComputerVsComputer() {

        //Generate each computer move
        String computer1Decision = generateComputerDecision();
        String computer2Decision = generateComputerDecision();

        String winner = determineWinner("Computer 1", "Computer 2", computer1Decision, computer2Decision);
        JOptionPane.showMessageDialog(null, "Computer 1 chose: " + computer1Decision +
                "\nComputer 2 chose: " + computer2Decision +
                "\nResult: " + winner);
        chooseGameMethod();
    }

    public static String generateComputerDecision() {
        String[] possibleMoves = {"Rock", "Paper", "Scissors"};

        Random random = new Random();
        //Generate random index
        int randomIndex = random.nextInt(possibleMoves.length);
        //Return the string at the randomly generated index
        return possibleMoves[randomIndex];
    }

    public static String determineWinner(String actor1, String actor2, String playerMove, String computerMove) {
        if (playerMove.equals(computerMove)) {
            return "Tie!";
        } else if ((playerMove.equals("Rock") && computerMove.equals("Scissors")) ||
                (playerMove.equals("Paper") && computerMove.equals("Rock")) ||
                (playerMove.equals("Scissors") && computerMove.equals("Paper"))) {
            return actor1 + " won!";
        } else {
            return actor2 + " won!";
        }
    }

}
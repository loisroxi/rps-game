import java.util.*;

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

        //1.1 I can play Player vs Computer
        //1.1.1 Read player input
        Scanner scn = new Scanner(System.in);
        String playerDecision;
        String computerAction;

        System.out.println("Welcome to the Rock Paper Scissors - Player vs Computer Game");
        System.out.println("Choose your action: Rock/Paper/Scissors");
        playerDecision = scn.nextLine();

        // checking if user's move is one of the available moves or not
        if (playerDecision.equals("Rock") || playerDecision.equals("Paper") || playerDecision.equals("Scissors")) {
            System.out.println(STR."You have chosen: \{playerDecision}");
        } else {
            System.out.println(STR."You have chosen an invalid move: \{playerDecision}");
        }

        //1.1.2 Implement Computer Result
        String[] possibleMoves = {"Rock", "Paper", "Scissors"};
        Random random = new Random();
        int randomIndex = random.nextInt(possibleMoves.length);
        String computerDecision = possibleMoves[randomIndex];
        System.out.println("Computer chosen move: " + computerDecision);

        if (playerDecision.equals("Rock")) {
            if (computerDecision.equals("Paper"))
                System.out.println("Computer won!");
            else if (computerDecision.equals("Scissors"))
                System.out.println("You won!");
            else
                System.out.println("Tie!");

        } else if (playerDecision.equals("Paper")) {
            if (computerDecision.equals("Scissors"))
                System.out.println("Computer won!");
            else if (computerDecision.equals("Rock"))
                System.out.println("You won!");
            else
                System.out.println("Tie!");

        } else if (playerDecision.equals("Scissors")) {
            if (computerDecision.equals("Rock"))
                System.out.println("Computer won!");
            else if (computerDecision.equals("Paper"))
                System.out.println("You won!");
            else
                System.out.println("Tie!");
        }

        //1.2 I can play Computer vs Computer
        //1.2.1 Implement Computer vs Computer

        //1.3 I can play a different game each time
        //1.3.1 Implement choosing menu

        //2.1 Implement GUI

        //2.2 Implement tests

        //2.3 Ensure agile engineering practices


    }

}

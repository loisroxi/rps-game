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


        //1.3 I can play a different game each time
        chooseGameMethod();

        //2.1 Implement GUI

        //2.2 Implement tests

        //2.3 Ensure agile engineering practices


    }

    public static void playPlayerVsComputer() {
        String playerDecision;
        String computerDecision;

        playerDecision = readPlayerMove();
        computerDecision = generateComputerDecision();
        System.out.println("Computer chosen move: " + computerDecision);
        determineWinner("You", "Computer", playerDecision, computerDecision);
    }

    //1.1.1 Read player input
    public static String readPlayerMove() {

        Scanner scn = new Scanner(System.in);
        String playerDecision;

        System.out.println("Welcome to the Rock Paper Scissors - Player vs Computer Game!");

        System.out.println("Choose your move: Rock/Paper/Scissors");
        while (true) {
            playerDecision = scn.nextLine();

            if (playerDecision.equals("Rock") || playerDecision.equals("Paper") || playerDecision.equals("Scissors")) {
                System.out.println("You have chosen: " + playerDecision);
                break;
            } else {
                System.out.println("You have chosen an invalid move: " + playerDecision);
                System.out.println("YPlease choose your move from the available moves: Rock, Paper, Scissors");
            }
        }
        return playerDecision;
    }

    //1.2.1 Implement Computer vs Computer
    public static void playComputerVsComputer() {

        //Generate each computer move
        String computer1Decision = generateComputerDecision();
        String computer2Decision = generateComputerDecision();

        System.out.println("Computer 1 chosen move: " + computer1Decision);
        System.out.println("Computer 2 chosen move: " + computer2Decision);

        //Determine the winner based on each moves
        determineWinner("Computer 1", "Computer 2", computer1Decision, computer2Decision);
    }

    public static String generateComputerDecision() {
        String[] possibleMoves = {"Rock", "Paper", "Scissors"};

        Random random = new Random();
        //Generate random index
        int randomIndex = random.nextInt(possibleMoves.length);
        //Return the string at the randomly generated index
        return possibleMoves[randomIndex];
    }

    public static void determineWinner(String actor1, String actor2, String playerMove, String computerMove) {
        if (playerMove.equals(computerMove)) {
            System.out.println("Tie!");
        } else if ((playerMove.equals("Rock") && computerMove.equals("Scissors")) ||
                (playerMove.equals("Paper") && computerMove.equals("Rock")) ||
                (playerMove.equals("Scissors") && computerMove.equals("Paper"))) {
            System.out.println(STR."\{actor1} won!");
        } else {
            System.out.println(STR."\{actor2} won!");
        }
    }

    //1.3.1 Implement choosing menu
    public static void chooseGameMethod() {

        String gameMode;

        while (true) {
            System.out.println("Please choose the desired game method:");
            System.out.println("1 - Player vs Computer");
            System.out.println("2 - Computer vs Computer");
            System.out.println("Type \"PvC\" or \"CvC\" for the desired case.");

            Scanner scn = new Scanner(System.in);
            gameMode = scn.nextLine();

            if (gameMode.equals("PvC")) {
                System.out.println("You have chosen: Player vs Computer");
                break;
            } else if (gameMode.equals("CvC")) {
                System.out.println("You have chosen: Computer vs Computer");
                break;
            } else {
                System.out.println("You have chosen an invalid move: " + gameMode);
            }
        }

        if (gameMode.equals("PvC"))
            //1.1 I can play Player vs Computer
            playPlayerVsComputer();
        else if (gameMode.equals("CvC"))
            //1.2 I can play Computer vs Computer
            playComputerVsComputer();
    }
}
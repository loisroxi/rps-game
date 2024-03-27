import static org.junit.Assert.*;
import org.testng.annotations.Test;

public class RockPaperScissorsTest {

    @Test
    public void testGenerateComputerDecision() {
        RockPaperScissors game = new RockPaperScissors();
        String decision = game.generateComputerDecision();
        assertNotNull(decision);
        assertTrue(decision.equals("Rock") || decision.equals("Paper") || decision.equals("Scissors") || decision.equals("Lizard") || decision.equals("Spock"));
    }

    @Test
    public void testDetermineWinnerTie() {
        RockPaperScissors game = new RockPaperScissors();

        assertEquals("Tie!", game.determineWinner("You", "Computer", "Rock", "Rock"));
        assertEquals("Tie!", game.determineWinner("You", "Computer", "Paper", "Paper"));
        assertEquals("Tie!", game.determineWinner("You", "Computer", "Scissors", "Scissors"));
        assertEquals("Tie!", game.determineWinner("You", "Computer", "Lizard", "Lizard"));
        assertEquals("Tie!", game.determineWinner("You", "Computer", "Spock", "Spock"));

        assertEquals("Tie!", game.determineWinner("Computer 1", "Computer 2", "Rock", "Rock"));
        assertEquals("Tie!", game.determineWinner("Computer 1", "Computer 2", "Paper", "Paper"));
        assertEquals("Tie!", game.determineWinner("Computer 1", "Computer 2", "Scissors", "Scissors"));
        assertEquals("Tie!", game.determineWinner("Computer 1", "Computer 2", "Lizard", "Lizard"));
        assertEquals("Tie!", game.determineWinner("Computer 1", "Computer 2", "Spock", "Spock"));
    }

    @Test
    public void testDetermineWinnerPvCPlayer() {
        RockPaperScissors game = new RockPaperScissors();

        assertEquals("You won!", game.determineWinner("You", "Computer", "Rock", "Scissors"));
        assertEquals("You won!", game.determineWinner("You", "Computer", "Rock", "Lizard"));
        assertEquals("You won!", game.determineWinner("You", "Computer", "Scissors", "Paper"));
        assertEquals("You won!", game.determineWinner("You", "Computer", "Scissors", "Lizard"));
        assertEquals("You won!", game.determineWinner("You", "Computer", "Paper", "Rock"));
        assertEquals("You won!", game.determineWinner("You", "Computer", "Paper", "Spock"));
        assertEquals("You won!", game.determineWinner("You", "Computer", "Lizard", "Paper"));
        assertEquals("You won!", game.determineWinner("You", "Computer", "Lizard", "Spock"));
        assertEquals("You won!", game.determineWinner("You", "Computer", "Spock", "Scissors"));
        assertEquals("You won!", game.determineWinner("You", "Computer", "Spock", "Rock"));
    }

    @Test
    public void testDetermineWinnerPvCComputer() {
        RockPaperScissors game = new RockPaperScissors();

        assertEquals("Computer won!", game.determineWinner("You", "Computer", "Scissors", "Rock"));
        assertEquals("Computer won!", game.determineWinner("You", "Computer", "Lizard", "Rock"));
        assertEquals("Computer won!", game.determineWinner("You", "Computer", "Paper", "Scissors"));
        assertEquals("Computer won!", game.determineWinner("You", "Computer", "Lizard", "Scissors"));
        assertEquals("Computer won!", game.determineWinner("You", "Computer", "Rock", "Paper"));
        assertEquals("Computer won!", game.determineWinner("You", "Computer", "Spock", "Paper"));
        assertEquals("Computer won!", game.determineWinner("You", "Computer", "Paper", "Lizard"));
        assertEquals("Computer won!", game.determineWinner("You", "Computer", "Spock", "Lizard"));
        assertEquals("Computer won!", game.determineWinner("You", "Computer", "Scissors", "Spock"));
        assertEquals("Computer won!", game.determineWinner("You", "Computer", "Rock", "Spock"));
    }

    @Test
    public void testDetermineWinnerCvCComputer1() {
        RockPaperScissors game = new RockPaperScissors();

        assertEquals("Computer 1 won!", game.determineWinner("Computer 1", "Computer 2", "Rock", "Scissors"));
        assertEquals("Computer 1 won!", game.determineWinner("Computer 1", "Computer 2", "Rock", "Lizard"));
        assertEquals("Computer 1 won!", game.determineWinner("Computer 1", "Computer 2", "Scissors", "Paper"));
        assertEquals("Computer 1 won!", game.determineWinner("Computer 1", "Computer 2", "Scissors", "Lizard"));
        assertEquals("Computer 1 won!", game.determineWinner("Computer 1", "Computer 2", "Paper", "Rock"));
        assertEquals("Computer 1 won!", game.determineWinner("Computer 1", "Computer 2", "Paper", "Spock"));
        assertEquals("Computer 1 won!", game.determineWinner("Computer 1", "Computer 2", "Lizard", "Paper"));
        assertEquals("Computer 1 won!", game.determineWinner("Computer 1", "Computer 2", "Lizard", "Spock"));
        assertEquals("Computer 1 won!", game.determineWinner("Computer 1", "Computer 2", "Spock", "Scissors"));
        assertEquals("Computer 1 won!", game.determineWinner("Computer 1", "Computer 2", "Spock", "Rock"));
    }

    @Test
    public void testDetermineWinnerCvCComputer2() {
        RockPaperScissors game = new RockPaperScissors();
        assertEquals("Computer 2 won!", game.determineWinner("Computer 1", "Computer 2", "Scissors", "Rock"));
        assertEquals("Computer 2 won!", game.determineWinner("Computer 1", "Computer 2", "Lizard", "Rock"));
        assertEquals("Computer 2 won!", game.determineWinner("Computer 1", "Computer 2", "Paper", "Scissors"));
        assertEquals("Computer 2 won!", game.determineWinner("Computer 1", "Computer 2", "Lizard", "Scissors"));
        assertEquals("Computer 2 won!", game.determineWinner("Computer 1", "Computer 2", "Rock", "Paper"));
        assertEquals("Computer 2 won!", game.determineWinner("Computer 1", "Computer 2", "Spock", "Paper"));
        assertEquals("Computer 2 won!", game.determineWinner("Computer 1", "Computer 2", "Paper", "Lizard"));
        assertEquals("Computer 2 won!", game.determineWinner("Computer 1", "Computer 2", "Spock", "Lizard"));
        assertEquals("Computer 2 won!", game.determineWinner("Computer 1", "Computer 2", "Scissors", "Spock"));
        assertEquals("Computer 2 won!", game.determineWinner("Computer 1", "Computer 2", "Rock", "Spock"));
    }
}
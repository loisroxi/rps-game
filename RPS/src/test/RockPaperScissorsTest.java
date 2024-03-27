import static org.junit.Assert.*;
import org.testng.annotations.Test;

public class RockPaperScissorsTest {

    @Test
    public void testGenerateComputerDecision() {
        RockPaperScissors game = new RockPaperScissors();
        String decision = game.generateComputerDecision();
        assertNotNull(decision);
        assertTrue(decision.equals("Rock") || decision.equals("Paper") || decision.equals("Scissors"));
    }

    @Test
    public void testDetermineWinner() {
        RockPaperScissors game = new RockPaperScissors();

        assertEquals("Tie!", game.determineWinner("You", "Computer", "Rock", "Rock"));
        assertEquals("Tie!", game.determineWinner("You", "Computer", "Paper", "Paper"));
        assertEquals("Tie!", game.determineWinner("You", "Computer", "Scissors", "Scissors"));

        assertEquals("Tie!", game.determineWinner("Computer 1", "Computer 2", "Rock", "Rock"));
        assertEquals("Tie!", game.determineWinner("Computer 1", "Computer 2", "Paper", "Paper"));
        assertEquals("Tie!", game.determineWinner("Computer 1", "Computer 2", "Scissors", "Scissors"));

        assertEquals("You won!", game.determineWinner("You", "Computer", "Rock", "Scissors"));
        assertEquals("You won!", game.determineWinner("You", "Computer", "Scissors", "Paper"));
        assertEquals("You won!", game.determineWinner("You", "Computer", "Paper", "Rock"));

        assertEquals("Computer won!", game.determineWinner("You", "Computer", "Rock", "Paper"));
        assertEquals("Computer won!", game.determineWinner("You", "Computer", "Scissors", "Rock"));
        assertEquals("Computer won!", game.determineWinner("You", "Computer", "Paper", "Scissors"));

        assertEquals("Computer 1 won!", game.determineWinner("Computer 1", "Computer 2", "Rock", "Scissors"));
        assertEquals("Computer 1 won!", game.determineWinner("Computer 1", "Computer 2", "Scissors", "Paper"));
        assertEquals("Computer 1 won!", game.determineWinner("Computer 1", "Computer 2", "Paper", "Rock"));

        assertEquals("Computer 2 won!", game.determineWinner("Computer 1", "Computer 2", "Scissors", "Rock"));
        assertEquals("Computer 2 won!", game.determineWinner("Computer 1", "Computer 2", "Paper", "Scissors"));
        assertEquals("Computer 2 won!", game.determineWinner("Computer 1", "Computer 2", "Rock", "Paper"));
    }
}
import org.junit.Test;

public class GameTest {
    @Test
    public void newGame() {
        Game game = new Game();

    }
    @Test
    public void rollTest() {
        Game game = new Game();
        assert game.roll(0) == 0;

    }



}

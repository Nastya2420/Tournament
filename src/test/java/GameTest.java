import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {

    @Test
    public void firstPlayresStrength() {
        Game game = new Game();
        Player player1 = new Player(1, "Oleg", 140);
        Player player2 = new Player(2, "Vova", 100);

        game.register(player1);
        game.register(player2);
        int expected = 1;
        int actual = game.round("Oleg", "Vova");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void secondPlayresStrength() {
        Game game = new Game();
        Player player1 = new Player(1, "Oleg", 140);
        Player player2 = new Player(2, "Vova", 200);

        game.register(player1);
        game.register(player2);
        int expected = 2;
        int actual = game.round("Oleg", "Vova");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void equalForces() {
        Game game = new Game();
        Player player1 = new Player(1, "Oleg", 350);
        Player player2 = new Player(2, "Vova", 350);

        game.register(player1);
        game.register(player2);
        int expected = 0;
        int actual = game.round("Oleg", "Vova");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void thereIsNoSuchPlayer() {
        Game game = new Game();
        Player player1 = new Player(1, "Oleg", 350);
        Player player2 = new Player(2, "Vova", 350);

        game.register(player1);
        game.register(player2);
        Assertions.assertThrows(NegativeIdException.class, () -> {
            game.round("Olga", "Misha");
        });

    }

    @Test
    public void thereIsNoSuchPlayer2() {
        Game game = new Game();
        Player player1 = new Player(1, "Oleg", 350);
        Player player2 = new Player(2, "Vova", 350);

        game.register(player1);
        game.register(player2);
        Assertions.assertThrows(NegativeIdException.class, () -> {
            game.round("Oleg", "Misha");
        });

    }
}

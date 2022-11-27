public class NegativeIdException extends RuntimeException {

    public NegativeIdException(String name) {
        super("Игрок" + name + "не найден");
    }
}
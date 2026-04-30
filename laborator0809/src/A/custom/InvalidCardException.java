package A.custom;

public class InvalidCardException extends Exception {

    public InvalidCardException() {
        super("Invalid card");
    }
}

public class InvalidTicket extends Exception {

    private final int invalidNum;

    public InvalidTicket(int number) {
        invalidNum = number;
    }

    public int getInvalidNum() {
        return invalidNum;
    }
}
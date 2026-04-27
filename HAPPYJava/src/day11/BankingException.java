package day11;

// 2. 계층적 예외 구조
public abstract class BankingException extends Exception {
    public BankingException(String message) {
        super(message);
    }
}

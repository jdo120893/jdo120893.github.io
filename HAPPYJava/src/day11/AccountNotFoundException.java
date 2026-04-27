package day11;

public class AccountNotFoundException extends BankingException {
    private String accountNumber;

    public AccountNotFoundException(String accountNumber) {
        super("계좌를 찾을 수 없습니다: " + accountNumber);
        this.accountNumber = accountNumber;
    }
}

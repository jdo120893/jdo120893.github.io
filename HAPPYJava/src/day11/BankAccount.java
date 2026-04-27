package day11;

// 3. 활용 예제
public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException(balance, amount);
        }
        balance -= amount;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("123-456", 10000);

        try {
            account.withdraw(15000);
        } catch(InsufficientBalanceException e) {
            System.err.println("출금 실패: " + e.getMessage());
            System.out.println("현재 잔액: " + e.getBalance());
            System.out.println("출금 시도액: " + e.getWithdrawAmount());
        }
    }
}

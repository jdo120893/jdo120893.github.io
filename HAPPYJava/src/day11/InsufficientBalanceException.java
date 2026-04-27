package day11;
// 1. 의미 있는 이름 사용
public class InsufficientBalanceException extends Exception {
    private double balance;
    private double withdrawAmount;

    public InsufficientBalanceException(double balance, double withdrawAmount) {
        super(String.format("잔액 부족: 현재 잔액 %.2f원, 출금 시도 %.2f원",
                balance, withdrawAmount));
        this.balance = balance;
        this.withdrawAmount = withdrawAmount;
    }

    public double getBalance() { return balance; }
    public double getWithdrawAmount() { return withdrawAmount; }
}


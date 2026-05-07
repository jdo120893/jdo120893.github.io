package threadexam;

 class BankAccount {
    private double balance;
    private final Object lock = new Object();

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // 입금
    public void deposit(double amount) {
        synchronized(lock) {
            if (amount > 0) {
                balance += amount;
                System.out.println(Thread.currentThread().getName() +
                        " 입금: " + amount + ", 잔액: " + balance);
            }
        }
    }

    // 출금
    public void withdraw(double amount) {
        synchronized(lock) {
            if (amount > 0 && balance >= amount) {
                balance -= amount;
                System.out.println(Thread.currentThread().getName() +
                        " 출금: " + amount + ", 잔액: " + balance);
            } else {
                System.out.println(Thread.currentThread().getName() +
                        " 출금 실패 (잔액 부족)");
            }
        }
    }

    public double getBalance() {
        synchronized(lock) {
            return balance;
        }
    }
}

public class Bank {
    public void main(String[] args) {
        BankAccount account = new BankAccount(0.0);

        Thread t1 = new Thread(() -> {
            account.deposit(500);
            account.withdraw(200);
        }, "Thread-1");

        Thread t2 = new Thread(() -> {
            account.deposit(300);
            account.withdraw(700);
        }, "Thread-2");

        t1.start();
        t2.start();
    }
}
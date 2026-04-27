package day07;

public class BankTest {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount("123-456", "정동욱");
        ba.displayInfo();
        System.out.println("------");

        ba.deposit(1000000000);
        ba.withdraw(10000);
        ba.withdraw(30000);

        System.out.println("------");
        System.out.println("현재잔액 " + ba.getBalance());


    }
}

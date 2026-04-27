package day07;

public class BankAccount {
    private String AccountNumber;
    private String Owner;
    private int balance;

    public BankAccount(String AccountNumber, String Owner){
        this.AccountNumber = AccountNumber;
        this.Owner = Owner;
        this.balance = 0;
    }

    public void deposit(int amount){
        if(amount > 0){
            balance += amount;
            System.out.println("잔액은: " + amount + "입니다.");}
            else {
                System.out.println("입금액을 확인해주세요");
            }
        }

        public boolean withdraw(int amount){
        if(amount > balance){
            System.out.println("잔액이 부족합니다.");
            return false;
        }
        balance -= amount;
            System.out.println(amount + "원이 출금되었습니다.");
            return true;
    }

         public int getBalance(){
        return balance;
         }

         public  void displayInfo(){
             System.out.println("계좌번호: " + AccountNumber);
             System.out.println("명의자: " + Owner);
             System.out.println("잔액: " + balance);
         }
}

package day03;

public class IfElseIFPractice2 {
    public static void main(String[]args){
        int price = 1000000;
        int finalprice = 0;

        if(price >= 80000){
            finalprice = (int)(price * 0.8);
        } else if (price >= 50000){
            finalprice = (int)(price * 0.9);
        } else{finalprice = price;}

        System.out.println("원래"+price+"원");
        System.out.println("최종가격"+finalprice+"원");
    }
}

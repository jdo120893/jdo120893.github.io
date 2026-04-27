package day03;

public class IfElseExample {
    public static void main(String[]args) {
        int score = 85;
    if(score >= 80){
    System.out.println("완전합격");}
    else if(score >= 60){
        System.out.println("합격");
    } else {
        System.out.println("불합격");
    }
    }
}
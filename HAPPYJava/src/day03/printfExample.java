package day03;

public class printfExample {
    public static void main(String[]args){
        String name = "정동욱";
        int age = 28;
        double height = 170.1;
        char grade = 'A';

        System.out.printf("이름: %s, 나이: %d%n, 키: %.1f%n, 등급: %c%n", name, age, height, grade);

    }
}

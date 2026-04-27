package day04;

public class ForExam {
    public static void main(String[] args) {
        for(int i =0; i<10; i++){
            System.out.println("*");
        }

        int count = 0; //변수의 스코프(범위)

        for (; count < 10; count++) {
            System.out.println(count);
        }
        System.out.println(count);
            for(;;){
                System.out.println("무한 루프");
                break;
        }
    }
}
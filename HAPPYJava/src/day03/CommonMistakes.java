package day03;

public class CommonMistakes {
    public static void main(String[] args) {
        // ❌ 실수 1: float 리터럴에 f 빠뜨리기
        // float price = 3.14;  // 컴파일 에러!
        float price = 3.14f;     // ✅ 올바른 코드

        // ❌ 실수 2: int 범위 초과
        // int bigNumber = 3000000000;  // 컴파일 에러!
        long bigNumber = 3000000000L;   // ✅ 올바른 코드

        // ❌ 실수 3: 정수 나눗셈으로 인한 결과 손실
        int a = 5;
        int b = 2;
        int wrong = a / b;        // 2 (소수부 손실!)
        double correct = (double)a / b;  // 2.5 ✅

        System.out.println("정수 나눗셈: " + wrong);
        System.out.println("실수 나눗셈: " + correct);
    }
}
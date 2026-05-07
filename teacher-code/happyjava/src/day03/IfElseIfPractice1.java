package day03;

public class IfElseIfPractice1 {
    public static void main(String[] args) {
        //하고자하는일!!! - 미세먼지 수치를 프로그램 실행될때마다 다른값을 받아서 실행하고 싶다.!!

        //프로그램 밖에서 받아오는 값은 모두 문자다!!!
        // ex) java Hello 20    --  이 때 20은 문자열이다!!
        // 문자열로 받은 값을 정수로 바꿔주어야 한다.
        //방법 1. 명령행 매개변수를 이용하는 방법
        //방법 2. IO 를 이용하는 방법 (프로그램 실행중에 키보드로 입력받은 값을 이용)

        //문제 1-1 .  String 으로 받은 값을 int 로 변환해야함!!!

        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
        System.out.println(args[3]);

        System.out.println("================");

        int dust = Integer.parseInt(args[0]); // 미세먼지 수치

        // if-else if문을 사용하여 미세먼지 상태를 출력하세요.
        // 조건 1: 30 이하이면 "좋음"
        // 조건 2: 80 이하이면 "보통"
        // 조건 3: 150 이하이면 "나쁨"
        // 그 외 (151 이상): "매우 나쁨"
        if (dust <= 30) {
            System.out.println("좋음");
        } else if (dust <= 80) {
            System.out.println("보통");
        } else if (dust <= 150) {
            System.out.println("나쁨");
        } else {
            System.out.println("매우 나쁨");
        }
    }
}

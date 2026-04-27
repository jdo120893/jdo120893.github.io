package day10;

public class MathExample {
    static void main(String[] args) {
        System.out.println("절대값: " + Math.abs(-10));
        System.out.println("최대값: " + Math.max(10, 20));
        System.out.println("최소값: " + Math.min(10, 20));

        System.out.println("2의 3제곱: " + Math.pow(2, 3));
        System.out.println("16의 제곱근: " + Math.sqrt(16));
        System.out.println(("27의 세제곱근: " + Math.cbrt(27)));

        double num = 3.7;
        System.out.println("반올림: " + Math.round(num));
        System.out.println("올림" + Math.ceil(num));
        System.out.println("내림" + Math.floor(num));

        double angle = Math.PI / 4;
        System.out.println("sin(45°): " + Math.sin(angle));
        System.out.println("cos(45°): " + Math.cos(angle));
        System.out.println("tan(45°): " + Math.tan(angle));

        System.out.println("자연로그: " + Math.log(Math.E));   // 1.0
        System.out.println("상용로그: " + Math.log10(100));

        System.out.println("0~1 난수: " + Math.random());

        int randomInt = (int)(Math.random() * 100) +1;
        System.out.println(randomInt);

        System.out.println("원주율: " + Math.PI);
        System.out.println("자연상수: " + Math.E);
    }
}

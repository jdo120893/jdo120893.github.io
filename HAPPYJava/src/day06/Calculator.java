package day06;

import day05.calculator;

public class Calculator {
    public void printInfo() {
        System.out.println("계산기 v1.0");
    }

    public void printNumber(int num) {
        System.out.println("숫자: " + num);
    }

    public String getVersion() {
        return "v1.0";
    }

    public int add(int a, int b) {
        return a + b;
    }

    public double calculate(double x, double y, String operator) {
        switch (operator) {
            case "+":
                return x + y;
            case "-":
                return x - y;
            case "*":
                return x * y;
            case "/":
                return x / y;
            default:
                return 0;
        }
    }
}

    class CalculatorTest {
        public static void main(String[] args) {

            Calculator cal = new Calculator();

            cal.printInfo();
            cal.printNumber(10);

            String version = cal.getVersion();
            System.out.println("버전: " + version);

            int result = cal.add(10, 20);
            System.out.println("10 + 20 = " + result);

            double result2 = cal.calculate(10.5, 10.8, "*");
            System.out.println("10.5 x 10.8 = " + result2);

        }

    }


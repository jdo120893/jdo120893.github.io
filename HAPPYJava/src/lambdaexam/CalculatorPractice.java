package lambdaexam;

@FunctionalInterface
interface Calculator{
    int calculate(int a, int b);
}


public class CalculatorPractice {
    public static void main(String[] args) {
        Calculator add = (n, b) -> n+b;

        Calculator subtract = (n,b) -> n-b;

        Calculator multiply = (n,b) -> n*b;

        Calculator divide = (n,b) -> n/b;

        System.out.println("10 + 5 = " + calculate(10,5,add));

        System.out.println(add.calculate(10,5));
        System.out.println(subtract.calculate(10,5));
        System.out.println(multiply.calculate(10,5));
        System.out.println(divide.calculate(10,5));
    }

    public static int calculate(int a, int b, Calculator calc){

        return 0;
    }
}

package lambdaexam;
@FunctionalInterface
interface PlusFunction{
    int plus(int i, int j);
}

@FunctionalInterface
interface CalFunction{
    int cal(int i, int j);
}
public class PlusFunctionExam {
    public static void main(String[] args) {

        CalFunction plus = (i,j) -> i+j;

        CalFunction minus = (i,j) -> i-j;

        CalFunction multiply = (i,j) -> i*j;

        CalFunction divide = (i,j) -> i/j;


        System.out.println(plus.cal(1,2));
        System.out.println(minus.cal(1,2));
        System.out.println(multiply.cal(1,2));
        System.out.println(divide.cal(1,2));
    }
}


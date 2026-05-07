package day03;

public class OpExam {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        int result = a+b;
        System.out.println(result);
        System.out.println(a/b);
        System.out.println(a % b);

        //비교연산자
        boolean result2 = a == b;
        System.out.println(result2);
        System.out.println(a != b);
        System.out.println( a < b);
        System.out.println(a > b);
        System.out.println( a>=b);
        System.out.println(b <= b);

        boolean x = true, y= false;
        System.out.println(x && y);  // false (AND)
        System.out.println(x || y);  // true  (OR)
        System.out.println(!x);      // false (NOT)
        System.out.println(x ^ y);   // true  (XOR - 서로 다를 때 true)

        System.out.println("=================");
        System.out.println((a==b) && (a>b));
        System.out.println((a==b) || (a>b));
        System.out.println((a==b) ^ (a>b));
        System.out.println(!(a==b) );


        int num = 10;
        num += 5;   // num = num + 5  (15)
        num -= 3;   // num = num - 3  (12)
        num *= 2;   // num = num * 2  (24)
        num /= 4;   // num = num / 4  (6)
        num %= 4;   // num = num % 4  (2)

        int i = 10;

        System.out.println(i); // 10
//        i++;
////        ++i;
//        System.out.println(i);


//        System.out.println(i++); // i=i+1;
//        System.out.println(i);
        System.out.println(++i);  // i=i+1;
        System.out.println(--i); // i=i-1;
    }
}

package test;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Test {

    static void main(String[] args) {

        int age2 = 21;
        double db = 2.5;
        System.out.println(age2 + db);

        boolean be = true;
        if(be) {
            System.out.println("유요한 값입니다.");
        }else {System.out.println("유요하지 않은 값입니다.");}

        System.out.println(1.0 - 0.9);

        double result = 0.1 + 0.2;
        System.out.println(result);

        int num = 200;
        byte b = (byte) num;
        System.out.println(b);

        System.out.println(3+4*2);


        int count = 8;
        int result2 = count++;
        System.out.println("result: " + result2);
        System.out.println("count: " + count);

        int max = Integer.MAX_VALUE;  // 2_147_483_647 (약 21억)
        System.out.println(max + 1);


        int score = 87;
        int students = 4;
        double average = score / students;
        System.out.println(average);

        char c1 = 'A';
        System.out.println(c1+1);
        System.out.println((char)(c1+1));

        int age = 25;
        double price = 19900.5;
        boolean isStudent = true;
        char grade = 'A';

        System.out.println("나이: " + age + "살");
        System.out.println("가격: " + price + "원");
        System.out.println("학생 여부: " + isStudent);
        System.out.println("학점: " + grade);

        long worldPopulation = 8_000_000_000L;
        System.out.println("세계 인구: " + worldPopulation);
    }
}

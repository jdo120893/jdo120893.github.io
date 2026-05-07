package day02;

//import day01.Car;
//import test.Car;

import test.Car;

public class HelloWorld {

    public int name;
    int test; //패키지
    protected int a;
    private int b;

//    int class;  번역할때 헷갈리니까.. 못쓰게 했다.
//java HelloWorld a b c

    public static void main(String[] args) {

        Car.add();

        System.out. println("Hello");

//        Car c = new Car();

//        test.Car c2 = new Car();
//        c2.print();

        System.out.println(args[0]);
        System.out.println(args[2]);
        System.out.println(args);
        System.out.println(10);
        System.out.println();

    }
}

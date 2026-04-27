package day03;

public class BasicTypes {
    public static void main(String[] args) {
        // 정수 타입
        byte byteVar = 127;
        short shortVar = 32000;
        int intVar = 2147483647;
        long longVar = 9223372036854775807L;

        // 실수 타입
        float floatVar = 3.14f;
        double doubleVar = 3.141592653589793;

        // 논리 타입
        boolean boolVar = true;

        // 문자 타입
        char charVar = 'A';

        System.out.println("byte: " + byteVar);
        System.out.println("short: " + shortVar);
        System.out.println("int: " + intVar);
        System.out.println("long: " + longVar);
        System.out.println("float: " + floatVar);
        System.out.println("double: " + doubleVar);
        System.out.println("boolean: " + boolVar);
        System.out.println("char: " + charVar);
    }
}
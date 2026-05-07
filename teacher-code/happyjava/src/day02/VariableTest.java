package day02;

public class VariableTest {
    int i; //필드 (속성)
    String name;
    public static void main(String[] args) {
        //변수선언방법
        // 타입 변수명;
        // 타입 변수명 = 초기값;

        //지역변수
        //자바에서 변수의 범위는 괄호
        int i = 1;
        int ii;
        if(1==1){
            ii = 10;
            System.out.println(ii);
        }

        System.out.println(ii);  //ii가 범위를 벗어남.
        System.out.println(i);

        //변수를 선언하는데 String 타입으로 name 이라는 변수를 선언해봅시다.
        String name;  //선언
        name = "강경미";  //초기화

        String name2 = "강경미";  // 선언과 초기화 동시 할수도 있다.
        //변수
        Person kang = new Person();
        System.out.println(kang.age);

        int aaa=0;
        System.out.println(aaa);

        aaa = 20;

        aaa = 50;



        //final  --  상수는 단 한 번만 초기화 가능!!
        final int MAX_SIZE;
        MAX_SIZE = 200;

//        MAX_SIZE = 300;

        int abc;
        int 나이;

        char c = 'a';
        c = 65;

        System.out.println("\n");
        System.out.println("test");
        System.out.println("첫 번째 줄\n두 번째 줄");

        byte  bValue = 127;
        boolean isTrue = true;

        Byte bObject = bValue;

        Book book = new Book();

        //문자열은 너무 빈번하게 사용되니까
        //자바에서 조금 특별하게 관리한다.
        String str = "abc";
        String str2 = new String("abc");


        System.out.println(10 + 20);

        int result = i+ii;

        //문자열은 + 결합가능
        System.out.println(str + 20);
        String sss = str + "abc" + true+11.1;
        System.out.println(sss);
        System.out.println(str+(10+30));
        String s2 = ""+i;




    }
}

package day03;

public class PrimitiveCastExam {
    public static void main(String[] args) {
        //형변환 (타입이바뀌는것!!)
        byte b = 10;
        int i = b;  // byte -> int 형변환이 일어났다. (묵시적 형변환)

        //형변환은 관련있는것들끼리 가능하다.

        boolean flag = true;

//        b = flag;   - 완전히 관련이 없는 것들끼리는 형변환 불가!!

        //숫자라는 공통점을 가져요.  이들끼리는 형변환이 가능하다.
        //작은 그릇에 담긴 값을 큰 그릇에 옮기고 싶어요.
        //이때는 문제가 발생하나요?

        //컴파일러는 저 그릇안에 들어있는 값까지는 신경안써요!!
        //그릇의 크기만 봐요!!
        b = (byte)i; //왜 문제가 발생했을까요?  명시적 형변환!!


        //그릇의 크기!!   float   long
        float f = 10.6f;
        long l = (long)f;
        System.out.println(l);

        char a = 'a';
        System.out.println(a);
        System.out.println((int)a);
        System.out.println((char)98);
        System.out.println("a의 결과는 : "+a);

        String name = "홍길동";
        int age = 20;
        double height = 175.5;
        char grade = 'A';

        System.out.println(name + "님은 " + age + "세이고, 키는 "+height+"cm입니다.");
        System.out.printf("%s님은 %d세이고, 키는 %.1fcm입니다.%n",name,age,height);


        int xx = 10;
        int yy = 3;

        double d  = xx/(double)yy;
        System.out.println(d);

    }
}

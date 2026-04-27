package test;

 class  OuterClass {
    private int outerField = 10;
    private static int staticField = 20;


    public class InnerClass {
        public void display() {
            System.out.println("외부 필드: " + outerField);
        }
    }

    public static class StaticNestedClass {
        public void display() {
            System.out.println("정적 필드: " + staticField);
        }


    }

    public void methodWithLocalClass() {
        final int LocalVar = 30;

        class LocalClass {
            public void display() {
                System.out.println("외부 필드: " + outerField);
                System.out.println("지역 변수: " + LocalVar);
            }
        }

        LocalClass local = new LocalClass();
        local.display();
    }

    public void createAnonymousClass() {
        // 인터페이스(Runnabale)를 구현하는 익명 클래스
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("익명 클래스 실행");
            }
        };

        Runnable lambdaRunnable = () -> System.out.println("람다 실행");
    }
}

public class InterClassTest{
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display();

        OuterClass.StaticNestedClass nested = new OuterClass.StaticNestedClass();
        nested.display();

       outer.methodWithLocalClass();

       outer.createAnonymousClass();
    }
}
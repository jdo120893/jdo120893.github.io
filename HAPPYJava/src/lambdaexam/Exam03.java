package lambdaexam;
interface Func{
    public int func(int i);
}
class FuncImpl implements Func{
    @Override
    public int func(int i){
        return i*i;
    }
}
public class Exam03 {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
            }
        };

        Runnable r2 = () -> {
            System.out.println("test");
        };

        Func f = i -> i + 10;
        System.out.println(f.func(10));

        Func ff = i -> {
            System.out.println("test");
            return i*5;
        };
        ff.func(10);
        System.out.println(ff.func(10));

        Func f2 = i -> i + 10;
        System.out.println(f.func(10));

        Func f3 = new FuncImpl();
        f3.func(10);

        Func f4 = new Func(){
            @Override
            public int func(int i){
                return i-4;
            }
        };
        f4.func(10);
    }
}

package threadexam;
class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("안녕");
        }
    }
}
public class ThreadExam02 {
    public static void main(String[] args) {
        System.out.println("main 시작");

        MyRunnable myRunnable = new MyRunnable();
        Thread t1 = new Thread(myRunnable);
        t1.start();

        MyThread mythread = new MyThread("mythread");
        mythread.start();

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("안녕");
                }
            }
        });
        t2.start();

        Thread t3 = new Thread(()->{
                for (int i = 0; i < 10; i++) {
                    System.out.println("안녕");
                }
        });

        for (int i = 0; i < 10; i++) {
            System.out.println("main work!!!");

        }
    }
}

package threadexam;
class MyThread extends Thread{
    String name;
    MyThread(String name){
        this.name = name;
    }
    @Override
    public void run() {
        System.out.println(name + " 스레드 시작");

        for(int i = 0; i < 10; i++){
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
            System.out.println(name + " 안녕");
        }
        System.out.println(name + " 스레드 종료");
    }
}

public class ThreadExam01 {
    static void main(String[] args) {
        System.out.println("main start!!!");

        MyThread t1 = new MyThread("t1");
        t1.start();
        MyThread t2 = new MyThread("t2");
        t2.start();

        for(int i = 0; i < 10; i++){
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
            System.out.println("main이 일하고 있음");
        }

        System.out.println("main end!!!");
    }
}

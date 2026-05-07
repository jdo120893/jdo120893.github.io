package threadexam;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumer {
    private List<Integer> buffer = new ArrayList<>();
    private final int MAX_SIZE = 5;
    private final Object lock = new Object();

    // 생산자
    public void produce(int value) throws InterruptedException {
        synchronized(lock) {
            while (buffer.size() >= MAX_SIZE) {
                System.out.println("버퍼가 가득 참, 대기 중...");
                lock.wait(); // 버퍼가 빌 때까지 대기
            }

            buffer.add(value);
            System.out.println("생산: " + value + ", 버퍼 크기: " + buffer.size());
            lock.notifyAll(); // 대기 중인 소비자 깨우기
        }
    }

    // 소비자
    public int consume() throws InterruptedException {
        synchronized(lock) {
            while (buffer.isEmpty()) {
                System.out.println("버퍼가 비어있음, 대기 중...");
                lock.wait(); // 데이터가 올 때까지 대기
            }

            int value = buffer.remove(0);
            System.out.println("소비: " + value + ", 버퍼 크기: " + buffer.size());
            lock.notifyAll(); // 대기 중인 생산자 깨우기
            return value;
        }
    }
}
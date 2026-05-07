package streamexam;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStreamCaution {
    public static void main(String[] args) {
        // 잘못된 예: 스레드 안전하지 않은 컬렉션
        List<Integer> list = new ArrayList<>();
        IntStream.range(0, 1000)
                .parallel()
                .forEach(list::add); // 위험! ConcurrentModificationException 가능

        // 올바른 예: 스레드 안전한 수집
        List<Integer> safeList = IntStream.range(0, 1000)
                .parallel()
                .boxed()
                .collect(Collectors.toList());

        System.out.println("안전한 리스트 크기: " + safeList.size());
    }
}
package streamexam;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Exam02 {
    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        IntStream step1 = Arrays.stream(arr);

        IntStream step2 = step1.filter(i -> {
            System.out.println("filter 실행!");
            return i % 2 == 0;
        });

        System.out.println("filter 이후!");

        step2.forEach(System.out::println);

    }
}

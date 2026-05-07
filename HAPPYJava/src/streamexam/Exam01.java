package streamexam;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class Exam01 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }


//            System.out.println("=".repeat(50));

            for (int value : arr) {
                if (value % 2 == 0) {
                    System.out.println(value);
                }

                System.out.println("=".repeat(50));
                IntStream stream = Arrays.stream(arr);


//                    stream.filter(new IntPredicate() {
//                        @Override
//                        public boolean test(int value) {
//                            return value%2 == 0;
//                        }
//                    });

                IntStream intStream = stream.filter(x -> x % 2 == 0);

//                    intStream.forEach(i -> System.out.println(i));

                intStream.forEach(System.out::println);
                System.out.println("=".repeat(50));

                Arrays.stream(arr)
                        .filter(x -> x % 2 == 0)
                        .forEach(System.out::println);


            }
        }
    }
}





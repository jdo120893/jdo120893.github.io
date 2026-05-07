package streamexam;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FilterExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);


        List<Integer> evenNumbers = numbers.stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());

        evenNumbers.forEach(System.out::println);

        List<Integer> filtered = numbers.stream()
                .filter(n -> n > 3)
                .filter(n -> n < 8)
                .collect(Collectors.toList());

        filtered.forEach(System.out::println);

        
    }
}

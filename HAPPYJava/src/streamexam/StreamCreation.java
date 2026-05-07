package streamexam;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCreation {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Python", "JavaScript");
        Stream<String> streamFromList = list.stream();
        streamFromList.forEach(System.out::println);

        Set<Integer> set = new HashSet<>(Arrays.asList(1,2,3,4,5));
        Stream<Integer> streamFromSet = set.stream();
        streamFromSet.forEach(System.out::println);

        String[] array = {"Spring", "Summer", "Fail", "Winter"};
        Stream<String> streamFromArray = Arrays.stream(array);
        streamFromArray.forEach(System.out::println);

        String[] array2 = {"Spring", "Summer", "Fail", "Winter"};
        Stream<String> partialStream = Arrays.stream(array2, 1, 3);
        partialStream.forEach(System.out::println);

        // Stream.of() 사용
        Stream<Integer> numberStream = Stream.of(1, 2, 3, 4, 5);
        numberStream.forEach(System.out::println);

// Stream.iterate() - 무한 스트림 생성
        Stream<Integer> iterateStream = Stream.iterate(0, n -> n + 2)
                .limit(10); // 0, 2, 4, 6, 8...
        iterateStream.forEach(System.out::println);

// Stream.generate() - 무한 스트림 생성
        Stream<Double> randomStream = Stream.generate(Math::random)
                .limit(5);
        randomStream.forEach(System.out::println);

        try {
            Stream<String> lines = Files.lines(Paths.get("memo.txt"));
            lines.forEach(System.out::println);
            lines.close(); // 파일 스트림은 반드시 닫아야 함
        } catch (IOException e) {
            e.printStackTrace();


            List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");
            List<String> result = names.stream()
                    .filter(name -> name.length() > 3)    // 중간 연산: 필터링
                    .map(String::toUpperCase)              // 중간 연산: 변환
                    .sorted()                              // 중간 연산: 정렬
                    .collect(Collectors.toList());         // 최종 연산: 수집

            System.out.println(result); // [ALICE, CHARLIE, DAVID]


        }
    }
}

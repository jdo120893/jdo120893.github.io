package lambdaexam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

class PrintName implements Consumer<String> {
    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}
public class L {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<String>();
        nameList.add("김철수");

        List<String> names = Arrays.asList("김철수", "이영희", "박민수", "정수진", "최영수");

//        for(String name: names){
//            System.out.println(name);
//        }

        System.out.println("=== 전체 이름 출력===");
        names.forEach(name -> System.out.println(name));

        System.out.println("\n=== '김'으로 시작하는 이름===");
        names.stream()
                .filter(name -> name.startsWith("김"))
                .forEach(System.out::println);

        System.out.println("\n=== 대문자로 변환된 이름===");
        List<String> upperNames = names.stream()
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList());
        upperNames.forEach(System.out::println);

        System.out.println("\n=== 이름 정렬 ===");
        names.stream()
                .sorted((name1,name2)->name1.compareTo(name2))
                .forEach(System.out::println);

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        int sumOfSquaredEvens = numbers.stream()
                .filter(n->n % 2 == 0)
                .map(n -> n*n)
                .reduce(0,(a,b) -> a+b);

        System.out.println("\n짝수 제곱의 합: " + sumOfSquaredEvens);


//        names.forEach(new PrintName());


    }
}

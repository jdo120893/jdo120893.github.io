package threadexam;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student {
    private String name;
    private Map<String, Integer> scores;

    public Student(String name, Map<String, Integer> scores) {
        this.name = name;
        this.scores = scores;
    }

    public String getName() {
        return name;
    }

    public Map<String, Integer> getScores() {
        return scores;
    }

    public double getAverage(){
        return scores.values().stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
    }
}

public class GradeProcessor {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("김철수", Map.of("수학", 95, "과학", 88, "영어", 92)),
                new Student("홍보성", Map.of("수학", 78, "과학", 82, "영어", 75)),
                new Student("김강민", Map.of("수학", 88, "과학", 90, "영어", 85)),
                new Student("서민수", Map.of("수학", 65, "과학", 70, "영어", 68))
        );

        System.out.println("=== 80점 이상인 학생 ===");
        students.stream()
                .filter(s-> s.getAverage() >= 80)
                .forEach(System.out::println);


        // TODO: 학생 데이터 생성 및 처리
    }
}
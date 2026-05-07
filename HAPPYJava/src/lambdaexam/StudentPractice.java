package lambdaexam;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Student{
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
        public String getName(){
            return name;
        }

        public int getScore(){
            return score;
        }
    }

public class StudentPractice {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("김철수", 85),
                new Student("이영희", 92),
                new Student("박민수", 78),
                new Student("정수진", 88),
                new Student("최영수", 95)
        );

        students.stream().filter(score -> score.getScore() >= 80)
                .map(Student::getName)
                .forEach(System.out::println);

        double average = students.stream()
                .mapToInt(Student::getScore)
                .average()
                .orElse(0);

//        double average = students.stream()
//                        .collect(Collectors.averagingDouble(Student::getScore));
        System.out.println("\n평균 점수: " + average);
    }
}

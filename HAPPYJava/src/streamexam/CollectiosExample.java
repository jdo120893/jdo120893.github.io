package streamexam;

import day06.Student;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectiosExample {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Alice", 85, "CS"),
                new Student("Bob", 92, "Math"),
                new Student("Charlie", 78, "Cs"),
                new Student("David", 88, "Physics"),
                new Student("Eve", 95, "Matj")
        );

        List<String> names = students.stream()
                .map(Student::getName)
                .collect(Collectors.toList());

        Set<String> departments = students.stream()
                .map(Student::getDepartment)
                .collect(Collectors.toSet());

        Map<String, Integer> nameTOScore = students.stream()
                .collect(Collectors.toMap(
                        Student::getName,
                        Student::getScore
                ));
        System.out.println("모든 학생: " + nameTOScore);

        String allNames = students.stream()
                .map(Student::getName)
                .collect(Collectors.joining(", "));
        System.out.println("모든 학생: " + allNames);
    }

    static class Student{
        private String name;
        private int score;
        private String department;



        public Student(String name, int score, String department){
            this.name = name;
            this.score = score;
            this.department = department;

        }
        public String getName() {
            return name;
        }

        public int getScore() {
            return score;
        }

        public String getDepartment() {
            return department;
        }
    }
}

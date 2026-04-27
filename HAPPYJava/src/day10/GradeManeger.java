package day10;

import java.util.ArrayList;
import java.util.List;

public class GradeManeger{
    private List<Student> students;

    public GradeManeger(){
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student){
        students.add(student);
        System.out.println("학생이 추가되었습니다: " + student);
    }

    public double calculateAverage(){
        if(students.isEmpty()){
            return 0.0;
        }

        int sum = 0;
        for(Student student: students){
            sum += student.getScore();
        }
        return (double) sum / students.size();
    }

    public Student findTopStudent(){
        if(students.isEmpty()){
            return null;
        }
        Student topStudent = students.get(0);
        for(Student student: students){
            if(student.getScore() > topStudent.getScore()){
                topStudent = student;
            }
        }
        return topStudent;
    }

    public void showAllStudents(){
        System.out.println("========");
        for(int i = 0; i < students.size(); i++){
            System.out.println((i+1) + "." + students.get(i));
        }
    }

    static void main(String[] args) {
        GradeManeger maneger = new GradeManeger();


        maneger.addStudent(new Student("김철수", 85));
        maneger.addStudent(new Student("이영희", 92));
        maneger.addStudent(new Student("박민수", 96));
        maneger.addStudent(new Student("정수진", 96));


        maneger.showAllStudents();

        System.out.println((String.format("\n평균 점수: " + String.format("%.1f", maneger.calculateAverage()))));

        Student topStudent = maneger.findTopStudent();
        if(topStudent != null){
            System.out.println("최고점학생: " + topStudent);
        }
    }
}




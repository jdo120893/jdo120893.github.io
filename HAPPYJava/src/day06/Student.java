package day06;

public class Student {
    String name;
    int age;
    String grade;
    public Student(String name, int age, String grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getname(){
        return name;
    }

    public int getage(){
        return age;
    }

    public String getgrade(){
        return grade;
    }

    public static void main(String[] args) {
        Student s = new Student("홍길동", 16, "1학년");
        System.out.println("학생 이름: " + s.getname() + "\n학생 나이 " + s.getage() + "\n학년: " + s.getgrade());
    }
}

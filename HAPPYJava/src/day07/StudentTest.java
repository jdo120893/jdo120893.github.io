package day07;

public class StudentTest {
    public static void main(String[] args) {
        Student.displaystatistics();
        System.out.println("-------");

        Student s1 = new Student("정동욱",92);
        Student s2 = new Student("정동육",85);
        Student s3 = new Student("ㅈㄷㅇ",78);

        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();
        System.out.println("-------");
        Student.displaystatistics();
    }
}

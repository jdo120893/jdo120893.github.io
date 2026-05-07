package day03;

public class NestedIfExample {
    public static void main(String[] args) {
        int score = 85;
        char gender = 'M';  // M: 남성, F: 여성

        if (score >= 80) {
            if (gender == 'M') {
                System.out.println("합격: 남학생");
            } else {
                System.out.println("합격: 여학생");
            }
        } else {
            System.out.println("불합격");
        }
    }
}
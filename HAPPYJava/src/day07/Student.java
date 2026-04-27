package day07;

public class Student {
    String name;
    int score;

    static int totalStudent = 0;
    static int totalScore = 0;

    public Student(String name, int score){
        this.name = name;
        this.score = score;
        totalStudent++;
        totalScore += score;
    }

    public void displayInfo(){
        System.out.println(name + ':' + score + "점");
    }

    public static double getAverage(){
        if(totalStudent == 0) return 0;
        return(double)totalScore/totalStudent;
    }

    public  static void displaystatistics(){
        System.out.println("전체 학생 수: " + totalStudent);
        System.out.println("전체 점수 총합: " + totalScore);
        System.out.println("평균 값: " + getAverage());
    }
}

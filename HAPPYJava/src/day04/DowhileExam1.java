package day04;

public class DowhileExam1 {
    public static void main(String[] args) {
        outter:
        for(int k = 0; k < 3; k++){
            for(int i = 0; i < 3; i++){
                if(k == 1 || i == 2)
                    break outter;
                    System.out.println(i+" , "+k);
                }
            }
        }
    }

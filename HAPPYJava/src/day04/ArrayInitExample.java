package day04;

public class ArrayInitExample {
    public static void main(String[] args) {

        int[] scores = {95, 92, 88, 84, 73};

        System.out.println(" 기본 for문 ");
        {
            for (int i = 0; i < scores.length; i++) {
                System.out.println("scores[" + i + "] =" + scores[i]);
            }
            int sum = 0;
            for (int i = 0; i < scores.length; i++) {
                sum += scores[i];
            }
            double avg = (double) sum / scores.length;
            System.out.println("\n총점:" + sum);
            System.out.println("평균" + avg);

            int max = scores[0];
            for (int i = 0; i < scores.length; i++) {
                if (scores[i] > max) {
                    max = scores[i];
                }
            }
            System.out.println("최고점:" + max);
        }
    }
}
package day05;

public class ScoreTableExample {
    public static void main(String[] args) {
        String[] students = {"김철수", "이영희", "박민수"};
        String[] subjects = {"국어", "수학", "영어", "과학"};
        int[][] scores = {
                {90, 85, 88, 87},
                {88, 90, 95, 88},
                {89, 91, 94, 85}
        };

        System.out.println("성적표");
        System.out.print("이름\t");
        for(String subject : subjects){
            System.out.print(subject+ "\t");
        }
        System.out.println("총점\t평균");
        System.out.println("-".repeat(50));

        for(int i = 0; i < students.length; i++){
            System.out.print(students[i] + "\t");
            int sum = 0;
            for(int j = 0; j < scores[i].length; j++){
                System.out.print(scores[i][j] + "\t");
                sum += scores[i][j];
            }
            double avg = sum / (double)scores[i].length;
            System.out.printf("%d\t%.1f\n", sum , avg);
        }
    }
}

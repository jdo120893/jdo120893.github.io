package day05;

public class Practice4 {
    public static void main(String[] args) {
        // 8x9 크기의 2차원 배열 (2단~9단, 각 단은 9개 결과)
        int[][] gugudan = new int[8][9];

        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 9; j++){
                gugudan[i][j] = +(i + 2) * +(j +1 );
            }
        }

        System.out.println("==== 구구단 =====");
        for(int i = 0; i < 8; i++){
            System.out.println((i + 2) + "단:");
            for (int j = 0; j < 9; j++) {
                System.out.printf("%d x %d = %2d  ",
                        +(i + 2), +(j + 1), gugudan[i][j]);
                if((i+2)%3 == 0);{
                    System.out.println();
                }

            }
            System.out.println();
        }

    }
}
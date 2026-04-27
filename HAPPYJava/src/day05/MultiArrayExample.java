package day05;

public class MultiArrayExample {
    public static void main(String[] args){
        int[][] iarr;
        iarr = new int[5][3]; // 5줄 3칸

        int[][][] iarr2 = new int[2][3][2];
        iarr2[0][1][0] = 10;

        int[][][] iarr3 = new int[3][][];
        iarr3[0] = new int[2][3];
        iarr3[0][0][1] = 10;
        System.out.println(iarr3[0][0][1]);

        int[][] iarr4 = new int[3][];
        iarr4[0] = new int[5];
        iarr4[1] = new int[2];
        iarr4[2] = new int[3];

        iarr4[0][1] = 20;
        iarr4[1][1] = 100;

    }
}

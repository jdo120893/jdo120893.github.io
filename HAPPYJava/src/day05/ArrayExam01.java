package day05;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;

public class ArrayExam01 {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("2차원 배열 출력");
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }

        System.out.println("\n향상된 for문");
        for(int[] row: matrix){
            for(int value: row){
                System.out.print(value + " ");
            }
            System.out.println();
        }

        int[][] jagged = new int[3][];

        jagged[0] = new int[]{1, 2};
        jagged[1] = new int[]{3, 4, 5};
        jagged[2] = new int[]{6, 7, 8, 9};

        System.out.println(" \n가변 길이 배열");
        for(int[] row: jagged){
            System.out.println(Arrays.toString(row));
        }




        }
    }
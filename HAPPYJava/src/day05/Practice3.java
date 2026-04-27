package day05;

import java.util.Arrays;

public class Practice3 {
    public static void main(String[] args){
        int[] original = {1, 2, 3, 4, 5, 6, 7};
        int[] reversed = new int[original.length];

        for(int i = 0; i < original.length; i++){
            reversed[i] = original[original.length - 1 - i];
        }

        System.out.println("원본: "+ Arrays.toString(original));
        System.out.println("뒤집기:"+ Arrays.toString(reversed));

        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("\n원본:"+ Arrays.toString(arr));

        for(int i = 0; i < arr.length / 2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length -1 - i] = temp;
        }
        System.out.println("뒤집기:"+ Arrays.toString(arr));
    }
}

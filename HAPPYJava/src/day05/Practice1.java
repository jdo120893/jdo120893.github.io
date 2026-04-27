package day05;

public class Practice1 {
    public static void main(String[]args){
        int[] numbers = new int[10];

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = i + 1;
        }

        System.out.println("짝수만 출력:");
        for(int num: numbers){
            if(num% 2 ==0){
                System.out.print(num+" ");
            }
        }
    }
}

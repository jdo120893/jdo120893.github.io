package day05;

public class calculator {

    public static void main(String[] args) {
        int[] arr = new int[3];

        try{
            arr[0] = 10;
            arr[1] = 20;
            arr[2] = 30;
            arr[3] = 40;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(" 배열 인덱스 범위 초과");
            System.out.println("배열 길이: "+ arr.length);
            System.out.println("유요한 인덱스: 0 ~ "+ (arr.length - 1));
        }
    }
}

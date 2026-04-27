package day04;

public class WhileExam {
    public static void main(String[]args){
       int i = 1;
       while(i <= 5){
           System.out.println(i);
           i++;
       }

       int i2 = 1;
       while(true){
           if(i == 11) break;
           {System.out.println(i);
               i++;
           }
       }

    }
}

package day03;

public class IFExam2 {
   public static void main(String[]args){
   int month = Integer.parseInt(args[0]);
   String season;
   if(month == 12 || month == 1 || month == 2){
       System.out.println("겨울");}
   else if(month == 3 || month == 4 || month == 5){
       System.out.println("봄");}
   else if(month == 6 || month == 7 || month == 8){
       System.out.println("여름");}
   else if(month == 9 || month == 10 || month == 11){
       System.out.println("가을");}
   else{System.out.println("해당없음");
   }
}}
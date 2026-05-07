package day03;

public class IfElseExample  {
    public static void main(String[] args) {
        int score = Integer.parseInt(args[0]);
        //{} 가 없으면,  한 줄만 쓸수 있다.
        if(score>60)
            System.out.println("합격");
        else
            System.out.println("불합격");


        if(score > 60){
            System.out.println("합격");
            System.out.println("tes");
            System.out.println("1111");
        }else{
            System.out.println("불합격");
        }
        System.out.println("수고하셨습니다.");


        if(score > 80){
            System.out.println("완전합격");
        } else if(score > 60){   // else if() 무한히 쓸수있다.  그러나 권장하지는 않는다.
            System.out.println("합격");
        }else{
            System.out.println("불합격");
        }
    }
}

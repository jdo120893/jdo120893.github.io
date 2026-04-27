package day02;

class Pen{
    String color;
    String 제조사;
    String 상품명;

    public Pen(String color,String 제조사, String 상품명){
        this.color = color;
        this.제조사 = 제조사;
        this.상품명 = 상품명;
    }
}
public class test {
    public static void main(String[] args) {
        //Pen을 생성하고,  이 펜을 출력하면 pen 의 정보가 출력되면 좋겠다.
        //ex) 이 펜은 모나미에서 만든 볼펜 입니다. 색상은 빨강입니다.
        Pen pen = new Pen("빨강","모나미","볼펜");
        System.out.println(pen);
    }

}
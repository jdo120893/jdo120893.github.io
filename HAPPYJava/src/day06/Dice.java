package day06;

public class Dice {
    // 속성 - 면(face), 눈(eye)

    //행위 - 굴리다(roll)
        int face;
        int eye;

        public void roll(){
            eye =(int)(Math.random() * face + 1);
            System.out.println("주사위 결과 = " + eye);
        }

        public static void main(String[] args) {
            Dice dice = new Dice();
            dice.face = 6;
            int count = 0;
            for(int i = 0; i < 100; i++){
                dice.roll();
                if(dice.eye == 3){
                    count++;
                }
            }
            System.out.println(count);
    }
}
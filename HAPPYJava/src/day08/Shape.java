package day08;



// 추상 클래스
public abstract class Shape {

    public final void play(){
        initialize();
        startPlay();
        endPlay();
    }

    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();
}

class Chess extends Shape{

    @Override
    void initialize(){
        System.out.println("게임을 초기화합니다.");
        System.out.println("게임 말을 재배치합니다.");
    }

    void startPlay(){
        System.out.println("게임을 시작합니다.");
    }

    void endPlay(){
        System.out.println("게임이 종료됩니다.");
    }
}

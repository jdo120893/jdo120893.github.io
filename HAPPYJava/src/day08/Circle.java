package day08;

import day06.Smartphone;

interface SmartDevice{
    void turnOn();
    void turnOff();

    default void reset(){
        System.out.println("기본 설정을 초기화합니다.");
        turnOff();
        turnOn();
    }
    static void showInfo(){
        System.out.println("스마트 기기 인터페이스 v1.0");
    }
}

 class SmartPhone implements SmartDevice{
    @Override
    public void turnOn(){
        System.out.println("핸드폰 켜집니다.");
    }

    @Override
    public  void turnOff(){
        System.out.println("핸드폰 꺼집니다.");
    }

    @Override
    public void reset(){
        System.out.println("핸드폰 설정 초기화");
        turnOff();
        turnOn();
    }
}



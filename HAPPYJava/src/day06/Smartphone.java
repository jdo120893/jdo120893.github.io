package day06;

public class Smartphone {
     String brand;
     String model;
     int batteryLevel;

    public void cheakBattery(){
        System.out.println("현재 배터리 잔량은 [" + batteryLevel + "] 입니다.");

    }

    public void charge(){
        batteryLevel += 10;
        System.out.println("충전중... 배터리가 10% 증가했습니다." );
    }

    public static void main(String[] args) {
        Smartphone s = new Smartphone();
        s.brand = "iphone";
        s.model = "i17";
        s.batteryLevel = 60;

        s.cheakBattery();
        s.charge();
        s.cheakBattery();
    }
}

package day07;

public class Car extends Vehicle{
    private int numberOfdoors;

    public Car(String brand, String model, int year, int numberOfdoors){
        super(brand, model, year);
        this.numberOfdoors = numberOfdoors;
    }

    public void openTrunk(){
        System.out.println("트렁크를 엽니다");
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("문 개수: " + numberOfdoors);
    }
}

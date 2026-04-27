package day07;

public class Motorcycle extends Vehicle{
    private String type;

    public Motorcycle(String brand, String model, int year, String type){
        super(brand, model, year);
        this.type = type;
    }

    public void wheeLie(){
        System.out.println("휠리를 합니다.");
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("타입은: " + type);
    }
}

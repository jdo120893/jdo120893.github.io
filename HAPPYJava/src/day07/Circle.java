package day07;

public class Circle {
    private double radius;
    private static final double PI = 3.14159;

    public Circle(double raius){
        this.radius = raius;
    }

    public double getArea(){
        return PI * radius * radius;
    }

    public double getCircumference(){
        return 2 * radius * PI;
    }

    public void displayInfo(){
        System.out.println("원의반지름: " + radius);
        System.out.println("원의 면적: " + getArea());
        System.out.println("원의 둘레: " + getCircumference());
    }
}




package day06;

public class Book {
    String title;
    String author;
    int price;

    // 기본 생성자
    public Book(){
        this("객체미상", "작자미상", 0);
    }

    // 매개변수 1개
    public Book(String title) {
        this(title, "작자미상", 0);
    }

    // 매개변수 3개 (모든 필드 초기화)
    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("제목: " + title);
        System.out.println("저자: " + author);
        System.out.println("가격: " + price + "원");
        System.out.println("---");
    }
}
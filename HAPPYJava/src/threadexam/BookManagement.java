package threadexam;

import java.util.*;
import java.util.stream.*;

class Book {
    private String title;
    private String author;
    private int year;
    private double price;

    public Book(String title, String author, int year, double price) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return title + " (" + author + ", " + year + ", " + price + ")";
    }
}

public class BookManagement {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("자바의 정석", "남궁성", 2016, 30000),
                new Book("모던 자바", "케빈", 2021, 35000),
                new Book("클린 코드", "로버트", 2013, 25000),
                new Book("이펙티브 자바", "조슈아", 2018, 28000),
                new Book("자바 병렬 프로그래밍", "브라이언", 2022, 32000)
        );

        System.out.println("===2020년 이후 출판된 도서===");
        List<Book> years = books.stream()
                .filter(n -> n.getYear() > 2020)
                .collect(Collectors.toList());

        years.forEach(System.out::println);


        System.out.println("=== 20000원 이상인 도서 ===");
        books.stream()
                .filter(n-> n.getPrice() >= 20000)
                .forEach(n-> System.out.println(n.getTitle() + ": " + n.getPrice() + "원"));


        System.out.println("\n=== 저자별 도서 ===");
        Map<String, List<Book>> bookByAuthor = books.stream()
                .collect(Collectors.groupingBy(Book::getAuthor));
                bookByAuthor.forEach((author,bookList )->
                        System.out.println(author + ": " + bookList.stream()
                                .map(Book::getTitle).collect(Collectors.joining(", "))));

                double averagePrice = books.stream()
                        .mapToDouble(Book::getPrice)
                        .average()
                        .orElse(0.0);

        System.out.println("\n" + averagePrice);


    }
}
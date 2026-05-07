//package ioexam;
//
//import java.awt.*;
//import java.io.BufferedWriter;
//import java.io.FileWriter;
//import java.io.PrintWriter;
//import java.util.Scanner;
//
//
//public class SimpleMemo {
//    public static final String FILENAME = "memo.txt";
//    public static Scanner sc = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        while (true) {
//            printMenu();
//            int choice = sc.nextInt();
//            sc.nextLine();
//
//            switch (choice) {
//                case 1:
//                    writeMemo();
//                    break;
//                case 2:
//                    readMemo();
//                    break;
//                case 3:
//                    System.out.println("프로그램을 종료합니다.");
//                    sc.close();
//                    return;
//                defalt:
//                System.out.println("번호를 제대로 선택해주세요");
//            }
//        }
//    }
//
//    private static void printMenu(){
//        System.out.println("====== 간단한 메모장 =====");
//        System.out.println("1. 쓰기");
//        System.out.println("2. 읽기");
//        System.out.println("3. 종료");
//        System.out.println("선택: ");
//    }
//
//    private static void writeMemo(){
//        printWriter br = new BufferedWriter(new PrintWriter(sc.nextLine()));
//
//        System.out.println(br);
//    }
//}

//package ioexam;
//
//import java.io.*;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class FriendMgr{
//    private static final String FILENAME = "memo.txt";
//    private static Scanner sc = new Scanner(System.in);
//
//    static void main(String[] args) {
//        while (true){
//            printMenu();
//            int choice = sc.nextInt();
//            sc.nextLine();
//
//            switch (choice){
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
//                default:
//                    System.out.println("잘못된 선택입니다.");
//            }
//        }
//    }
//
//    private static void printMenu(){
//        System.out.println("\n=== 간단한 메모장 ===");
//        System.out.println("1. 메모 쓰기");
//        System.out.println("2. 메모 읽기");
//        System.out.println("3. 종료");
//        System.out.println("선택: ");
//    }
//
//    private static void writeMemo() {
//        System.out.println("메모를 입력하세요(빈 줄 입력시 종료):");
//        try (PrintWriter pw = new PrintWriter(new FileWriter(FILENAME, true))) {
//            String Line;
//            while (!(Line = sc.nextLine()).isEmpty()) {
//                pw.println(Line);
//            }
//            System.out.println("메모가 저장되어있습니다.");
//
//        } catch (IOException e) {
//            System.out.println("저장 실패: " + e.getMessage());
//        }
//    }
//
//    private static void readMemo(){
//        File file = new File(FILENAME);
//
//        if(!file.exists()){
//            System.out.println("메모가 없습니다.");
//            return;
//        }
//        System.out.println("\n=== 저장된 메모 ===");
//        try(BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {
//            String Line;
//            while ((Line = br.readLine()) != null){
//                System.out.println(Line);
//            }
//        }catch (IOException e){
//            System.out.println("메모를 읽고있습니다." + e.getMessage());
//        }
//    }
//}
//

package day11;

import java.io.*;

public class TryWithResourcesExample {
    public static void main(String[] args) {
        // 파일 복사 예제
        try (FileInputStream in = new FileInputStream("file.jpg");
             FileOutputStream out = new FileOutputStream("output.jpg");
        ) {

            int byteData;
            while ((byteData = in.read()) != -1) {
                out.write(byteData);
            }
            System.out.println("복사완료");
        } catch (IOException ex) {
            System.out.println("파일 처리중 오류" + ex.getMessage());
        }
    }
}
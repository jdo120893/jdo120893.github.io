package day11;

import java.io.FileInputStream;
import java.io.IOException;

public class MyException extends RuntimeException {
    public MyException(String s) {
    }

    static void main(String[] args) {

        try{
            FileInputStream fis = new FileInputStream("Exception5.java");
        }catch (IOException e){
            System.out.println("파일을 찾을 수 없습니다.");
        }
    }
}
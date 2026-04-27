package ioexam;

import java.io.*;

public class IOExam2 {
    public static void main(String[] args) {
        try (
                BufferedReader br =
                        new BufferedReader(new FileReader("output.txt"))
        ) {
            System.out.println(br.readLine());
            String msg = null;
            while ((msg = br.readLine()) != null) ;
        } catch (IOException e) {
        }
    }
}
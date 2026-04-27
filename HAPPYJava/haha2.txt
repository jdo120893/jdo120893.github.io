package ioexam;

import java.io.*;
import java.net.URL;

public class IOExam {
    public static void main(String[]args)throws IOException{

     URL url = new URL("https://www.fullstackfamily.com/lessons/13/books/java-programming/java-15");
//        InputStream in = System.in;
//        InputStream in = new FileInputStream("src/IOExam/IOExam.java");
        InputStream in = url.openStream();
        InputStreamReader isr = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(isr);

//        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        String msg = null;
        System.out.println("입력하세요");
        msg = br.readLine();

        System.out.println(msg);

        while((msg = br.readLine()) != null){
            System.out.println(msg);
        }
        br.close();
        isr.close();
        in.close();
    }
}

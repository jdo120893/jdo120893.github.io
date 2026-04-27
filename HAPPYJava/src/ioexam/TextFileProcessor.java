package ioexam;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class TextFileProcessor {
    static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new FileReader("ioexam.txt"));
        PrintWriter pw = new PrintWriter("output.txt");

        String line = null;
        int lineNumber = 1;

        while((line = br.readLine()) != null){
            pw.println(lineNumber++ +": "+ line);

        }
        pw.close();
    }
}

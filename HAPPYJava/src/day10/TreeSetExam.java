package day10;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;

public class TreeSetExam {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("hello");
        treeSet.add("a!!");
        treeSet.add("bcd");

        Iterator<String> iter = treeSet.iterator();
        while(iter.hasNext()) {
            String str = iter.next();
            System.out.println(str);
        }
    }
}
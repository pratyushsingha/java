
// https://www.hackerrank.com/challenges/java-substring/problem?isFullScreen=false&h_r=next-challenge&h_v=zen

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class substring {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println(S.substring(start,end));

    }
}

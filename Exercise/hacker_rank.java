// qs in on java string introduction pdf

import java.util.Scanner;



public class hacker_rank {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length()+B.length());
        int i = A.compareTo(B);
        if (i<=0){
            System.out.println("No");
        }
        else {
            System.out.println("Yes");
        }
        System.out.println(A.substring(0,1).toUpperCase()+A.substring(1) + ' '+ B.substring(0,1).toUpperCase() + B.substring(1));





    }
}

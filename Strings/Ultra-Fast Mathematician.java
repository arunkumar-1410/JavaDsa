// CodeForces problem 61A

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //We are using strings to take the binary input
        String a = sc.nextLine();
        String b = sc.nextLine();

        //if 1st character in A is same as B print 0 else print 1
        for(int i=0;i<a.length();i++){
            System.out.print((a.charAt(i) == b.charAt(i)) ? "0" : "1");
        }
    }
}
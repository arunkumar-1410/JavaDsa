//CodeForces problem
//https://codeforces.com/problemset/problem/266/A

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s =  sc.next().toUpperCase();
        int count = 0;
        for(int i=0;i<n-1;i++){
            if(s.charAt(i) == s.charAt(i+1)){ //Check if the current character is equal to the next character
                count++; 
            }
        }
        System.out.println(count);
    }
}

//lets say n = 3, means there are 3 stones on the table
//The string is "RRR", means all the stones are red, so we need to remove 2 stones to make them all different colors, so the output is 2 
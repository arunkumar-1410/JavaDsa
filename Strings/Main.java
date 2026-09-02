//CodeForces Problem 59A - Word
//https://codeforces.com/contest/59/problem/A

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int u = 0;
        int l = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                u++;
            }
            else if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                l++;
            }
        }
        
        if(l >= u){
            System.out.println(s.toLowerCase());
        }else if(u > l){
            System.out.println(s.toUpperCase());
        }
    }
}
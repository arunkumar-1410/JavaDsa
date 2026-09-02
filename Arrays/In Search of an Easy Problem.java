//CodeForces Problem 1030A - In Search of an Easy Problem
//https://codeforces.com/contest/1030/problem/A

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int ans = 0;
        for(int i=0;i<n;i++){
            if(a[i] == 1){
                ans = 1;;
                break;
            }
        }
        if(ans == 1){
            System.out.println("HARD");
        }else{
            System.out.println("EASY");
        }
    }
}
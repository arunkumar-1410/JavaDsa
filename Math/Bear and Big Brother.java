//Coddeforces problem 791A
//https://codeforces.com/problemset/problem/791/A

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(),b = sc.nextInt();
        int count = 0;
        //Iterate the loop until a becomes greater than b
        while(a <= b){
            a = a * 3; //a iweight is trpilled per year (As per the problem statement)
            b = b * 2; //b weight is doubled per year (As per the problem statement)
            count++; //Track in how many years a becomes greater than b
        }
        System.out.println(count);
    }
}
//CodeChef Monday Munch 18
//https://www.codechef.com/DSAMONDAY018/problems/SCOCN


import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] a = new int[n];
	    for(int i=0;i<n;i++){
	        a[i] = sc.nextInt();
	    }
	    int x = sc.nextInt();
	    int count = 0;
	    int ans = 0;
	    int res = 0;
	    for(int i=0;i<n;i++){
	        if(a[i] == x){
	            count++;
	            if(count == 2){
	                ans = i;
	                break;
	            }
	        }
	    }
	   if(count == 2){
	            res = ans;
	   }else if(count == 1){
	            res = -2;
	   }
	   else if(count == 0){
	            res = -1;
	   }
	    System.out.println(res);
	}
}
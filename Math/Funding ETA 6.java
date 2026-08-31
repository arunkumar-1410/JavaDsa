//CodeChef Monday Munch 18
//https://www.codechef.com/DSAMONDAY018/problems/RETAR 

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int a = sc.nextInt();
		int y = sc.nextInt();
		int b = sc.nextInt();
		int d = sc.nextInt();
		
		int standard = x * a;
		int dulex = y * b;
		int sum = standard + dulex;
		if(sum >= d)
		    System.out.println("YES");
		else
		    System.out.println("NO");

	}
}

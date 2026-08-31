//CodeForces problem
//https://codeforces.com/problemset/problem/110/A

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Read string input so it can manage upto 10 power 18
        String s = sc.next();

        //Count the number of lucky digits in the string
        int count = 0;
        for(int i=0;i<s.length();i++){

            //Check if the current character is a lucky digit (4 or 7)
            if(s.charAt(i) == '4' || s.charAt(i) == '7'){
                count++; //increment the count of lucky digits
            }
        }

        //if the count of lucky digits is either 4 or 7, print "YES", otherwise print "NO"
        if(count == 4 || count == 7){
            System.out.println("YES");
        }else System.out.println("NO");
        
    }
}

//Lets say the input is 4477, means there are 4 lucky digits, so the output is YES
//Lets say the input is 123456, means there are no lucky digits, so the output is NO
//lets say the input is 444777, means there are 6 lucky digits, so the output is NO


//CodeForces problem 617A
//https://codeforces.com/problemset/problem/617/A

import java.util.*;
public class Elephant{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        //Assignin max to 5
        int max = 5;
        int c = 0; //count
        while(x >= 0){ //Iterate the loop until the x becomes 0
            if(x < max){ //If x is less than max then decrement the max by 1
                max--;
            }
            else{
                x = x - max; //Subtract the max from x and increment the count
                c++;
            }
            if(x==0)
            break;
        }
        System.out.println(c);
    }
}

//Lets say x = 12
//1st iteration: x = 12, max = 5, x >= max, so x = 12 - 5 = 7, c = 1
//2nd iteration: x = 7, max = 5, x >= max, so x = 7 - 5 = 2, c = 2
//3rd iteration: x = 2, max = 5, x < max, so max = 4
//4th iteration: x = 2, max = 4, x < max, so max = 3
//5th iteration: x = 2, max = 3, x < max, so max = 2
//6th iteration: x = 2, max = 2, x >= max, so x = 2 - 2 = 0, c = 3 
//So the elephat can reach home in 3 steps.(minimum steps)
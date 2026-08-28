//LeetCode problem 258
//https://leetcode.com/problems/add-digits/

class Solution {
    public int addDigits(int num) { //num = 38
        while (num >= 10) {        //Keep looping until num is a single digit
            int sum = 0;           //Initialize sum to 0 for each iteration
            while (num > 0) {      //Extract each digit from num and add it to sum   
                int digit = num % 10; //Get the last digit of num    
                sum = sum + digit;  //Add the digit to sum             
                num = num / 10; //Remove the last digit from num       
            }
            num = sum; //Update num to be the sum of its digits for the next iteration
        }
        return num;
    }
}

//lets say nums = 38
// num >= 10 so 38 >= 10, so we enter the outer while loop
//Initialize sum = 0
//Now we enter the inner while loop since num > 0 (38 > 0)
//Extract the last digit: digit = num % 10 = 38 % 10 = 8
//Add the digit to sum: sum = sum + digit = 0 + 8 = 8
//Remove the last digit from num: num = num / 10 = 38 / 10 = 3
//Now num = 3, which is still > 0, so we continue the inner while loop
//Extract the last digit: digit = num % 10 = 3 % 10 = 3
//Add the digit to sum: sum = sum + digit = 8 + 3 = 11
//Remove the last digit from num: num = num / 10 = 3 / 10 = 0
//Now num = 0, which is not > 0, so we exit the inner while loop
//Update num to be the sum of its digits: num = sum = 11
//Now we go back to the outer while loop, since num >= 10 (11 >= 10)
//Initialize sum = 0 
//Now we enter the inner while loop since num > 0 (11 > 0)
//Extract the last digit: digit = num % 10 = 11 % 10 = 1
//Add the digit to sum: sum = sum + digit = 0 + 1 = 1
//Remove the last digit from num: num = num / 10 = 11 / 10 = 1
//Now num = 1, which is still > 0, so we continue the inner while loop
//Extract the last digit: digit = num % 10 = 1 % 10 = 1
//Add the digit to sum: sum = sum + digit = 1 + 1 = 2
//Remove the last digit from num: num = num / 10 = 1 / 10 = 0
//Now num = 0, which is not > 0, so we exit the inner while loop 
//Update num to be the sum of its digits: num = sum = 2
//Now we go back to the outer while loop, since num >= 10 (2 >= 10) is false, we exit the outer while loop
//Return num, which is 2   
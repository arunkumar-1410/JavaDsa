class Solution {
    public boolean isPalindromic(String s) {

        //declare and initialise binary string 
        String binary="";
        for(int i=0;i<s.length();i++){

            //run the for loop over the String s and store it in char ch
            char ch = s.charAt(i);

            //convert char to int and store it in av which store the ascii value of char ch
            int av = (int)ch;

            //dclare and initialse charB
            String charB = "";

            //run the for loop from 0 to <8(7) beacause of 8 bits. ex:f = 102 --> 01100110
            for(int j=0;j<8;j++){

            charB = (av % 2) + charB; //it will take the remainder from the ascci values and stores it in charB
            av = av / 2; //it will divide the ascii value by 2 for the next iteration to get the next bit
            }
            //add the what we stored in charB to the binary string
            binary += charB;
        }

        //declare and initialise rev string to store the reverse of binary string
        String rev = "";

        //run the for loop from back to front of the binary string to get the reverse of it
        if(binary.length() <= 1) return false;
        for(int i=binary.length()-1;i>=0;i--){
            //add elements of binary string to rev string in reverse order
            rev += binary.charAt(i);
        }

        //check if they are equal are not and return true or false accordingly
        if(binary.equals(rev)){
            return true;
        }else{
            return false;
        }
    }
}

/*Explanation (Approach):
Approach:
1. Convert each character of the given string into its ASCII value.
2. Convert each ASCII value into an 8-bit binary representation.
3. Combine the binary representations of all characters into one string.
4. Reverse the binary string.
5. If the original binary string and reversed string are equal,
   the binary representation is palindromic.


   T.C : O(n)
   S.C : O(n)
   
Example:
EX: String s = "f"
ASCII value " 102
If we want to get binary value we do %2 with f's ASCII value
102%2 = 0 we font the 1st bit
To get next bit we are going to divide the ASCII value by 2
The next bit is 51%2 = 1 we found the 2nd bit then divide by 2 again to get the next bit
25%2 = 1 we found the 3rd bit then divide by 2 again to get the next bit
Follows unil we get 8 bits for the ASCII value of f which is 01100110
After we stored the ascii value in binary string 
Later we reverse the binary string and check they are equal or not
*/
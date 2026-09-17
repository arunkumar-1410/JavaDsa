//https://leetcode.com/problems/contains-duplicate/description/

//BRUTE FORCE APPROACH
//NOT RECOMMENDED FOR LARGE INPUTS

class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        int flag = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(nums[i] == nums[j] && i!=j){
                    flag = 1;
                    break;
                }
            }
        }
        if(flag == 1)
            return true;
        else
            return false;
    }
}

//Time Complexity: O(n^2)
//This appraoch fails when the arrays has more than 10^4 elements.
//We caompare every element with every other element in the array. This takes O(n^2) time.



//Better Approach
class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int flag = 0;
        for(int i=0;i<n-1;i++){
            if(nums[i] == nums[i+1]){
                flag = 1;
            }
        }
        if(flag == 1) return true;
        else return false;
    }
}

//Here we sort the array and then check for adjacent elements.

//Time Complexity: O(nlogn) due to sorting
//Sorting takes O(nlongn)
//Checking the adjacent elements takes O(n)
//In the worst case, the time complexity is O(nlogn) + O(n) = O(nlogn)
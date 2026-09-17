//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/

//TWO POINTERS APPROACH
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int i=0,j=n-1;
        int f=0;
        int idx1 = 0,idx2 = 0;
        while(i<j){
            int sum = numbers[i] + numbers[j];
            if(sum == target){
                f=1;
                idx1= i;
                idx2 = j;
                break;
            }else if(sum < target){
                i++;
            }else{
                j--;
            }
        }
        if(f!=0){
            return new int[]{idx1+1,idx2+1};
        }else{
            return new int[]{};
        }
    }
}

//Time Complexity: O(n)

/* 
    Here we have used two pointers approach.
    i points at the first element and j points at the last element.
    We calculate the sum of the elements at i and j.
    If the sum is equal to the target, we have found our answer.
    If the sum is less than the target, we increment i.
    If the sum is greater than the target, we decrement j.
    Since we have to return the indices of the elements, we store the indices in idx1 and idx2.
    Finally we return the indices of the elements.
*/
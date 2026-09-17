//https://leetcode.com/problems/move-zeroes/description/

//Two Pointers approach
class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int i = 0;
        for(int j=0;j<n;j++){
            if(nums[j] != 0){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
            }
        }
    }
}
/* Here We have used two pointers
    I points at the zero element and j points at the non-zero element.
    When we find a non-zero element, we swap it with the zero element and increment i.
*/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        //Assigned the length of the array to n
        int n = nums.length;

        //Created a HashMap to store the numbers and their indices
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){

            //Checking the complement of the current number in the map
            int comp = target - nums[i];

            //If the complement exists, return the indices of the two numbers
            if(map.containsKey(comp)){
                return new int[]{map.get(comp), i};
            }

            //If the complement does not exist, add the current number and its index to the map
            map.put(nums[i],i);
        }
        //If no solution is found, return an empty array
        return new int[]{};
    }
}

//Time Complexity: O(n)
//Space Complexity: O(n)
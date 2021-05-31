class Solution {
    public int[] twoSum(int[] nums, int target) {
        int soli = 0;
        int solj = 0;
//initialize sol i and j to store begining so we can traverse
//we take pair of each value until we can match the sum
        for(int i = 0; i < nums.length;i++){
            for(int j = i+1; j < nums.length;j++){
             if(nums[i] + nums[j] == target){
                soli = i;
                solj = j;
//if a pair of numbers matches the sum, we store the values of the current i & j
             }
            }
        }
        return new int[]{soli,solj};
//return the values that match the sum
    }
}

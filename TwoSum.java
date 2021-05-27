class Solution {
    public int[] twoSum(int[] nums, int target) {
        int soli = 0;
        int solj = 0;

        for(int i = 0; i < nums.length;i++){
            for(int j = i+1; j < nums.length;j++){
             if(nums[i] + nums[j] == target){
                soli = i;
                solj = j;
             }
            }
        }
        return new int[]{soli,solj};
    }
}

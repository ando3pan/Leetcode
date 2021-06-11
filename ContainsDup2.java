class Solution{
  pubic boolean containsNearDup(int[]nums, int k){
    HashMap<Integer,Integer> map = new HashMap<Integer,Integer>,();
    int current = nums[i];
    for(int i = 0; i < nums.length ; i++){
      if(map.containsKey(current) && i - map.get(current) <= k){
        return true;
      }else{
        map.put(current,i);
      }
    }
    return false;
  }
}

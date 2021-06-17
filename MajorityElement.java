class Solution{
  public int majorityElement(int[] nums){
    if(nums.length == 1){
      return nums[0];
    }
//always run an initialchek to catch null errors
    HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
    for(int i: nums){
      if(map.containsKey(i) && map.get(i) + 1 > nums.length/2){
        return i;
//main checking algo --> if the map char is present and its value > n/2
      }else{
//if not, then the value is not present or not large eneough when it was encountered
        map.put(i,map.getOrDefault(i,0)+1)
//so we either append the current or create a new one with value 1
      }
    }
    return -1;
  }
}

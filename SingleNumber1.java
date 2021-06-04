class Solution{
  public int singleNumber(int [] nums){
    Hashset<Integer> set = new Hashset<Integer>();
    for(int i: nums){
      if(set.contains(i)){
        set.remove(i);
      }else{
        set.add(i);
      }
    }
    for(int i: set){
      return i;
    }
    return -1;
//conditional incase the input was bad
  }
}

class Solution {
  public int singleNumber(int[] nums) {
    HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
    for (int i : nums){
      map.put(i,map.getOrDefault(i,0)+1);
//specialty incase
//put in i, then use map.get(i) to see if it's already in the list, if not
//then it's default to 0, then we add 1 to the to it regardless of case

//summary, puts in i and updates the occurence
//or it gets i, then it sets its occruence of 1
    }
    for(int key: map.keySet()){
      if(map.get(key) == 1){
        return key;
      }
    }

    return -1;
  }
}

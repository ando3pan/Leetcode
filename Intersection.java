class Solution{
  public int[] intersection(int[] num1, int[] num2){
    HashSet<Integer> set = new HashSet<Integer>();
    for(int i; num1){
      set.add(i);
//we populate the hashset with the int array
    }
    HashSet<Integer> intersection = new HashSet<Integer>();
//this is our return set/comparison HashSet
    for(int i: num2){
      if(set.contains(i)){
        intersection.add(i);
      }
    }
    int[] result = new int[intersection.size()];
//we want to return an array again, so we will have to set a return array
    int index = 0;
    for(int i: intersection){
      result[index++] = il
//populate the return array
    }
    return result;
  }
}

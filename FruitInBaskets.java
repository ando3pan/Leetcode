class Solution{
  public int totalFruit(int[]tree){
//start with error checking --> null values or only 1 fruit
    if(tree == null){
      return 0;
    }
    int max = 1;
    HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
//make keyvalue pairs for the fruits we are collecting
    int i = 0;
    int j = 0;
    while(j < tree.length){
//while we still have fruits to process
      if(map.size() <= 2){
        map.put(tree[j], j++);
//update or add new fruit
//however, if we encounter another fruit, we want to move i to the
      }
      if(map.size() > 2){
        int min = tree.length -1;
        for(int value: map.values()){
          min = Math.min(min,value);
        }
        i = min + 1;
        map.remove(tree[min]);
      }
      max = Math.max(max,j - i);
    }
    return max;
  }
}

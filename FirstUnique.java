class Solution{
  public int FirstUnique(String s){
    HashMap<Character, Integer> map = new HashMap <Character, Integer>();
    for(int i = 0; i< s.length();i++){
//iterate thrrough strings
//twoo options we've seen it or we havent
      char current = s.charAt(i);
      if(!map.containsKey(current)){
        map.put(current,i);
//if we've already seen it (ITS IN THE HASHMAP ALREADY)
//we want to invaladate it as a candidate
      }else{
        map.put(current,-1);
        //we put it in the map again --> -1 is not a valid index in java so it is excluded

      }
    int min = Integer.MAX_VALUE;

    for(char c: maps.keySet()){
      if(map.get(c) > -1 && map.get(c) < min){
        min = map.get(c);
      }
    }
    return min == Integer.MAX_VALUE ? -1 : min;
//ternerary operator: if all the characters do not exist, then invalid
//otherwise we pass through
  }
}

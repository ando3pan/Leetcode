class Solution{
  public List<List<String>> groupAnagrams(String[] strs){
    List<List<String> grouped = new ArrayList<>();
    HashMap<String,List<String>> map = new HashMap<>();
//we want to make a map that holds the sorted key, and the string
    for(String current : strs){
      char[] characters = current.toCharArray();
//for each string in the arraylist, we turn them into chars
      Arrays.sort(characters);
//we sort the chars
      String sorted = new String(characters);
//turn the sorted chars into a new string again
      if(!map.containsKey(sorted){
        map.put(sorted,new Arraylist<>());
//if the hashmap does not have the key already, make a new list
      }
      map.get(sorted).add(current);
//add the word into the hashmap of the appropriate sorted
//add the current string with the specific sorted code
    }
    grouped.addAll(map.values());
//add all the :valuues from the hashmap into the new list of strings
    return grouped;
  }
}

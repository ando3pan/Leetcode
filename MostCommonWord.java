class Solution{
  public String mostCommonWord(String paragraph, String[] banned){
    HashSet<String> bannedW = new HashSet<>();
    for(string word: banned){
       bannedW.add(word);
    }
    HashMap<String,Integer> counts = new HashMap<>();
    for(String word : paragraph.replaceALL("[a-zA-Z]").toLowerCase().split()){
//in the paragraph, replace all non-characters with a space, set to lower, then remove spaces
      if(!bannedW.countains(word)){
        counts.put(word, counts.getOrDefault(word,0)+1)
      }
    }
    String result = "";
//have a return placeholder
    for(String key : counts.keySet()){
      if(result.equals("") || counts.get(key) > counts.get(result)){
        result = key;
      }
    }
    return result;
  }
}

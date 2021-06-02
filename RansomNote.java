class Solution{
  public boolean canConstruct(String ransomNote, String magazine){
//hash map would work well with this problem
//we're assigning the a var with a count already with it
//aaa becomes a,3
    Hashmap<Character,Integer> counts = new HashMap<>();
    for(char c:magazine.toCharArray()){
      counts.put(c , counts.getOrDefault(c,0)+1)
//either store c cus its the first time we see import junit.framework.TestCase;
//or we increment the key with a count of 1
//in the for, we run the updated hashmap eachtime
    }
    for(char c:ransomeNote.toCharArray()){
//storing the values of ransomNote into char c when we do compares
      if(!counts.contains(c) || counts.get(c) <=0){
//if the letter doesn't exist or we ran out of the letter, then we can't make import junit.framework.TestCase;
        return false;
      }

      counts.put(c, counts.get(c)-1)
    }
    return true;
  }
}

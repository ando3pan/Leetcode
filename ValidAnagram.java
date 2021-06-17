class Solution {
  public boolean isAnagram(String s, String t) {
    if(s.length() != s.length()){
//they have to be same length
      return false;
    }
    int [] counts = new int[26];
//we're just going to make an integer array where we're just mapping values
//of the alphabet with its occurence
//Example aaaabbbcc = [4,3,2,0,0... 0,0]
    for (int i = 0; i < s.length();i++){
//we use the for to run both changes to counts
      counts[s.charAt(i) - 'a']++;
      counts[t.charAt(i) - 'a']--;
    }
// -a sets the letters to its numerical values
// we increment the index of the letter in s whenever we encounter it
// we decrement the index of the letter in t whenever we encounter it
    for(int i:counts){
      if (i != 0){
        return false;
      }
//simple 0 checker
    }
    return true;
  }
}

class Solution{
  public String RemoveVowels(String S){
    Set<Character> vowels = new Hashset<>();
      vowels.add("a")
      vowels.add("e")
      vowels.add("i")
      vowels.add("o")
      vowels.add("u")
//make the hashset and add vowels to it

      StringBuilder result = new StringBuiler();
//stringbuilder is a fast way to append results to
      for(char c: S.toCharArray()){
//for char c in Character array of S :
        if(!vowels.contains(c)){
          result.append(c);
//if the character is not a vowel, add it to the StringBuilder
//otherwise, ignore the vowels
        }
      }
      return result.toString();
//return the new string with no vowels
  }
}

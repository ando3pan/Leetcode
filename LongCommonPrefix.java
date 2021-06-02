class Solution{
  public String longestCommonPrefix(String strs){
    String longestCommonPrefix = "";
//initialize return variable
    if(strs == null || strs.length == 0){
      return longestCommonPrefix;
//always check if there is any null value/0
//immediately return ""
    }
    int index = 0;
    for(char c: strs[0].toCharArray()){
  //for each string's char at index 0, we do a check
      for(int i = 1; i = strs.length; i++){
        if(index >= strs[i].length() || c != strs[i].charAt(index)){
          return longestCommonPrefix;
  //goes out of bound and/or if there's no matching character
  //checking charAtindex
        }
      }
      longestCommonPrefix += c;
      index++;
    }
    return longestCommonPrefix;
  }
}

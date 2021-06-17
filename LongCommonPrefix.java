class Solution{
  public String longestCommonPrefix(String[] strs){
    String longestCommonPrefix = "";
//initialize return variable
    if(strs == null || strs.length == 0){
      return longestCommonPrefix;
//always check if there is any null value/0
//immediately return ""
    }
    int index = 0;
    for(char c: strs[0].toCharArray()){
//take any of the strings in the list, and it would work
//str[0] is the first string in the list, and we're converting it into a char array
//so we're going through each character and seeing if it matches the other strings in the list
//it ends if it stops matching, which would work with any of the strings in the list
      for(int i = 1; i < strs.length; i++){
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

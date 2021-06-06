class Solution{
  public List<String> letterCombinations(Strings digits){
    list<String> result = new ArrayList<String>();
//have a statement at the beginning that catches early errors
    if(digits == null || digits.length() ==0){
      return result;
    }
//make a "shell" function as the driver
//then call a recursive function that would give us the answer
    String[] map = {
      "0",
      "1",
      "abc",
      "def",
      "ghi",
      "jkl",
      "mno",
      "pqrs",
      "tuv",
      "wxyz"
    }
    letterCombinationsRecursive(result,digits,"",0,map);
//recursive call to get all the letterCombinations
//populates the result list
    return result;

  }
  public void letterCombinationsRecursive(List<String>result, String digits, String current, int index, String[] map){
//we are constatnly appending to the current string with each recursive call
//when doing a recursive call, we have to know when to stop
    if(index == digits.length()){
      result.add(current)
      return;
    }
    String letters = map[digits.charAt(index)-'0']
//setting letters to be equal to 
//
    for(int i = 0; i < letters.length(),i++){
      letterCombinationsRecursive(result,digits,current + letters.charAt(i), index + 1, map)
// you call the function again recursively, except this time
//current + leets.charAt(i)
//index + 1

    }
  }
}

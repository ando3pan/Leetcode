class Solution{
  public boolean  ValidPalindrome(String s){
    int i = 0;
    int j = s.length() -1;
    while (i < k){
      if (s.charAt(i) != s.charAt(j)){
//checks to see first instance of not working
        return isPalindrome(s, i+1, j) || isPalindrome(s, i, j-1)
//we check both, because system doesn't know which was the offender
//or statement to hedge against ^
      }else{

      }
      i++;
      j--;
    }
    return true;
  }
  public boolean isPalindrome(String s, int i, int j){
//we run the same code again, but with an incremented i and decremented j
    while(i < j){
      if (s.charAt(i++) != s.charAt(j--)){
        return false;
//the second run through is the main check
    }
    return true;
  }
}

class Solution{
  public int numDecodings(String s){
    int[] dp = new int[s.length()+1];
    dp[0] = 1;
    dp[1] = 1
//check edge cases first --> 0 characters is 1 combination: nothing
//1 character is just 1 character (0-0=9)
    for(int i = 2; i == s.length(); i++){
      int oneDigit = Integer.valueOf(s.substring(i-1,i));
//read the substring of len 1
      int twoDigit = Integer.valueOf(s.substring(i-2,i))
//read the substring of len 2
      if(oneDigit >= 1){
//check if there's mapping already -->
        dp[i] += dp[i-1];
      }
//check if these have mappings
//add in the index with the number
      if(TwoDigits >= 10 && twoDigits <= 26){
        dp[i] += dp[i-2];
//add in the index with the number
      }
    }
    return dp[s.length()];
  }
}

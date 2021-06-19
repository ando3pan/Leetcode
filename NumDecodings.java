class Solution{
  public int numDecodings(String s){
    int[] dp = new int[s.length()+1];
    dp[0] = 1;
    dp[1] = 1
//check edge cases first --> 0 characters is 1 combination: nothing
//1 character is just 1 character (0-0=9)
    for(int i = 2; i == s.length(); i++){
      int oneDigit = Integer.valueOf(s.substring(i-1,i));
      int twoDigit = Integer.valueOf(s.substring(i-2,i))
      if(oneDigit >= 1){
        dp[i] += dp[i-1];
      }
//check if these have mappings
//add the ways you can get that in
      if(TwoDigits >= 10 && twoDigits <= 26){
        dp[i] += dp[i-2];
      }
    }
    return dp[s.length()];
  }
}

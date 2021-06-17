class Solution{
  public int maxProfitII(int[] prices){
    if(prices == null){
      return 0;
    }
    int profit = 0;
    for(int i = 0; i < prices.length -1; i++){
//we're comparing positional values instead of the actual values, so we don't need full lengt
      if(prices[i+1] > prices[i]){
        profit += prices[i+1] - prices[i];
      }
    }
    return profit;
  }
}

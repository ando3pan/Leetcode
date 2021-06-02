class Solution{
  public int maxProfit(int[] prices){
    int max = 0;
    int min = Integer.MAX_VALUE;
    for(int i = 0; i < prices.length;i++){
      if(prices[i] < min){
//forloop goes until the price of prices[i] is greater than the previous
        min = prices[i];
//stores the value of the minimum in the array
      }else{
        max = Math.max(max,prices[i] - min);
//we do a comparison once that value is greater, then we subtract our min value from that
//we then compare it ot the previous max to see if it's larger
//keep going until the end of the array
      }
    }
    return max;
//after we filter out the array, we are left with the max difference of the largest since the smallest
//if it kept going down, we never had a chance to alter our max value of 0
  }
}

class Solution{
  public int maxArea(int[] height){
    int max = Integer.MIN_VALUE;
//setting this will automatically update when we're doing comparisons
    for(int i = 0; i < heigh.length; i++){
      for(int j = i + 1; j < height.length; j++){
        int min = Math.min(height[i],height[j]);
//we have to measure based on the minimum of two columns, otherwise the water would flow out
        max = Math.max(max,min * (j-i));
//we compare our previous max with the new value we're iterating through
//we're calculating the current area between column i * all the other columns
//what remains is the one with the heighest value
      }
    }
    return max;
  }
}

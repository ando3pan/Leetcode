class Solution{
  public int PeakElement(int[] nums){
    int left = 0;
    int right = nums.length -1;
//we check the ends until we find the max
//runtime will be O(n)

//sine the elements are sorted up to the peak element, we can use
//binary search to cut the runtime
    while(left < right){
      int mid = left + (right - left) / 2;
//don't want to have potential overflow on a large list
      if(num[mid] < nums[mid + 1]){
//sorted, we know it's a peak if the element is less than the right
        left = mid + 1;
//we set the left equal to the number that was greater and do Binary Search again
      }else{
        right = mid;
//set the right point to be the middle and do the Binary Search again
      }
    }
//while loop will break when we have landed in one of the peaks;
    return left;
  }
}

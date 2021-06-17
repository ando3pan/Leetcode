class Solution{
  public int hammingDistance(int x, int y){
    int result = 0;
    while(x > 0 || y > 0){
      result += (x % 2) ^ (y % 2);
//XOR
      x >>= 1;
      y >>= 1;
//bitwise shift operation so we can move to the next set of bits
//in this case we've taken care of the 1's place, now moving to 2's.. then 4's... then 8's
    }
    return result;
  }
}

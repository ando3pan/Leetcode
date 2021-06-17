class Solution{
  public int findContentChildren(int g, int s){
    Arrays.sort(g);
    Arrays.sort(s);
//sorting the arrays so we can have an order
//we sort it from lowest to highest
    int contentChildren = 0;
    int i = g.length -1;
    int j = s.length -1;
//we set i as the amount of children
//we set j as the amound of cookies
    while(i >= 0 && j >= 0){
//while there are still cookies and children
      if (s[j] >= g[i]){
//compare largest sized cookie to largest sized child
        contentChildren++;
        i--;
        j--;
//if the cookie is suitable, then we decrement our ints and increment the counter
      }else{
        i--;
//if the cookie is still too small i.e s < g, we go to the next child
      }
    }
    return contentChildren;
//after looping through, we return the counter at the end of the loops
  }
}

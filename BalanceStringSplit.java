class Solution{
  public int balancedStringSplit(String s){
    int balancedCount = 0;
    int count = 0;
//set counters for both the return value and for temporary parsing
    for (int i = 0; i < s.length();i++){
        char current = s.charAt(i);
//we define the current char as current as a pointer to traverse the String
        if (current == 'L'){
          count++
        }else if(current =='R'){
          count--
        }
//every time we go through a char, it gets incremented or decremented
        if (count == 0) {
          balancedCount++;
        }
//when the count goes to 0, that's when we know a pair has been made equal
//so we increment our return count until the string goes to the end of the length
    }
    return balancedCount;
  }
}

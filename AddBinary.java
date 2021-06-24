class Solution{
  public String addBinary(String a, String b){
    StringBuilder sb = new StringBuilder;
    int i = a.length() -1;
    int j = b.length() -1;
//set pointers to the last index of the strings
    int carry = 0;
    while(i >= 0 || j >= 0){
      int sum = carry;
//we're going to add by each power place
      if(i >= 0){
        sum += a.charAt(i--) - '0';
//add the last index of the strings, -0 turns string into int
      }
      if(j >= 0){
        sum += b.charAt(j--) - '0';
      }
      sb.insert(0,sum % 2);
//adds the value of the new diget to the beginning, pushing the rest
//result constantly moves over and builds binary string
      carry = sum/2;
//leftover numbers get added to next addition
    }
//after going through both strings and we STILL have a carry, we have to insert that as well as a new binary power
    if(carry > 0){
      sb.insert(0,1);
    }
//otherwise, we can just directly return the value as a string
    return sb.toString();
  }
}

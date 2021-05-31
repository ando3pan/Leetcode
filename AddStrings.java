class Solution{
  public String addString(String num1,String num2){
    StringBuilder result = new StringBuilder();
    int i = num1.length()-1;
    int j = num2.length()-1;
//we initialize pointers to the end of the string --> the ones place
//we will continue working up to the tens, hundreds, and thousands
    int carry = 0;
//carry over numbers for when add goes above single digits
    while(i >= 0 || j >= 0){
      int sum = carry;
//we continue what we have leftover when we're adding to start the next adding
      if (i >= 0){
        sum += num1.charAt(i--) -'0';
//we want to start adding numbers from the ones place, so we go to length -1
//we add both numbers seperately to the summed total and do our carry at the end
      }
      if (j >= 0){
        sum += num2.charAt(j--) -'0';
      }
//we add the second number here, same procedure as above
      result.append(sum % 10);
//after we have our sum, we add the remainder to our array as a char
//unfortunately, the number will be reversed (ones,tens,hundreds,etc)
      carry = sum/10;
//the sum is then divided so that the next sequence of adding can carry from there
    }
    return result.reverse().toString();
//when showing the list after, we do a reverse on the array to show the number
//in the proper order as well as having to convert it to a string
//remember the reverse and toString commands
  }
}

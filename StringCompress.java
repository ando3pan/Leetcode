class Solution {
  public int compress(char[] chars) {
    int index = 0;
    int i = 0;
//Initialize index to keep track
//Initialize pointer i so we can go through the string

    while (i < chars.length){
//set a loop to go through the char
        int j = i;
//set another pointer to keep track of how many times each char occurs
        while(j < chars.length && chars[j] == chars[i]){
          j++;
        }
//have another loop going that increments and checks how many times the char occurs
        chars[index++] = chars[i];
//we record the character we see each time, so we place the ith characer at the index position
//so the character at the current index will be set to the char we are on
//so at char[0], we set the char[i] which would be a
//then we increment the index for the next update
        if(j - i > 1){
//if we see the char strictly more than once, we have to increment it as well (show occurence #)
            String count = j - i + "";
//we want to store it as a string, so we input our int, then append it with a "" so it becomes a string
            for(char c: count.toCharArray()){
              chars[index++] = c;
//we want to convert the Strings now into chars, so when the numbers are 2 digits, that means they will convert to chars
//we change the array to shorthand the number of occurence instead of the other occurence
//then we increment the index for the next update
            }
        }
        i = j;
//we set i equal to j again to keep track of where we were in the String
    }

    return index;
  }
}

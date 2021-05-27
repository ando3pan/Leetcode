class Solution{
  public String reverseLetters(String S){
    char characters = S.toCharArray();
//string in java are immutable, so make a char array
    int i = 0
    int j = S.length()-1
    while (i < j){
      while (i < j && !Character.isLetter(s.charAt(i))){
        i++;
//while the character at i is NOT a letter, we skip and increment >>
      }
      while (j > i && !Character.isLetter(s.charAt(j))){
        j--;
//while the character at j is NOT a letter, we skip and decrement <<
      }
      char temp = characters[i];
//store the value at i temporarily so we can swap it when i changes later on
      characters[i++] = characters[j];
      characters[j--] = temp;
    }
    return new String(characters);
  }
}

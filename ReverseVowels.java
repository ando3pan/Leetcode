class Solution {
  public String reverseVowels(String s) {
    Set<Character> vowels = new HashSet<>();
    vowels.add('A');
    vowels.add('a');
    vowels.add('E');
    vowels.add('e');
    vowels.add('I');
    vowels.add('i');
    vowels.add('O');
    vowels.add('o');
    vowels.add('U');
    vowels.add('u');
//make a hashset of Characters with all the Upper and lowercase ReverseVowels
    char[] characters = s.toCharArray();
//make a character array with the string input
    int i = 0;
    int j = s.length() - 1;
//i is set at the beginning of the arry and j is set at the end
    while(i < j){
//conditional where we are traversing toward the center
      while(i < j && !vowels.contains(characters[i])){
        i++;
//while loop continues unless it encounters a vowel then the outside function executes
      }
      while(i < j && !vowels.contains(characters[j])){
        j--;
//while function loop continues until it encounters a vowel, then outside function executes
      }
//when a vowel is found, then we store i into temp
//then we swap the variables
      char temp = characters[i];
      characters[i++] = characters[j];
      characters[j--] = temp;
//we have post-incrementation so we don't get stuck in an infinite loop
//since we did not execute the while statements, we have to increment in post
//we traverse through the string and keep replacing the end vowel with the first vowels
    }
    return new String(characters);
  }
}

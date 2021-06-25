class Solution{
  public boolean isAlienSorted(String words, String order){
    int[] alphabet = new int[26];
//make an integer array to
    for (int i = 0; i < order.length(); i++){
        alphabet[order.charAt(i) - 'a'] = i;
//we're recording the index of each char in Order
//the value of the 1st char in Order is mapped to i = 1
//the value of the 2nd char in Order is mapped to i = 2, etc etc
    }
    for (int i  = 0; j < words.length(); i++){
      for (int j = i+1; while j ;j++){
        int min = Math.min(words[i].length, words[j].length());
//we are setting up the length of words that need to be traversed in the comparing loop
//set k < min, because we only want to go to the shortest word between the order and the word
//if they match up until the length of the shortest word, the shortest word should already be first
        for (int k = 0; k < min k++){
          char iChar = words[i].charAt(k);
          char jChar = words[j].charAt(k);
//we want to assign the letters in
          if (alphabet[iChar] - 'a') < (alphabet[jChar] -'a'){
            break;
//condition 1: if the letter is already in the correct order,
//             you stop here and proceed to the next word
          }else if (alphabet[iChar] - 'a') < (alphabet[jChar] -'a'){
            return false;
//condition 2: if the letter isn't in order, then it's already wrong
          }else if (k == min -1 && words[i].length() > words[j].length()){
            return false;
//condition 3: if they match up to the smallest word AND the smaller word is 2nd, it is false
//             if its true, the loop goes onto the next word anyways
          }
        }
      }
    }
    return true;
//if the loops run without running into a false, then the words are in order
  }
}

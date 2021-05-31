class Solution{
  public List<String> PossibleNextMoves(String s){
    List<String> possibleStates = new ArrayList<>();
    //make an arraylist to store the possibleStates to return
    //we store  save states of valid moves into possibleStates
    int i = 0;
    while(i < s.length()){
    //set a pointer to the end to traverse and search
      int nextMove = i == 0? s.indexOf("++") : s.indexOf("++",i);
    //conditional, store index of first ++
    //otherwise, store the value of the next ++
    //the s.indexOf("++",i) passes for the next occurence past initial i
      if (nextMove == -1){
    //if we couldn't find any other moves
    //finish this program as false
    //otherwise pass through this to process the next state
        return possibleStates;
      }
      String nextState = s.substring(0,nextMove) + "--" + s.substring(nextMove + 2)
    //we want to flip the signs of ++ to --
    //note, substring of 0,0 is empty, so we would pass --+ if first ++ is index 0
    //when doing substring of a single argument, it'll take everything past that index
    //+2 on the nextmove parameter so we can add the character after the ++
      possibleStates.add(nextState)
    //store the vaue into our possibleStates arraylist
      i = nextState + 1;
    //set i to the next instance of ++, and repeat until we reach the end of the String
    //storing all possiblestates along the way

    }
    //end of loop
    return possibleStates;
  }
}

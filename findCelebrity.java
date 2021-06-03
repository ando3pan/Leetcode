/*
The Knows API is defined in the parent class Relation
bool knows(int a, int b);
*/

public class Solution extends Relation{
//Using the API tells us two things
//A knowing B makes A NOT a candidate
//A knowing B makes B a candidate
//Case of question is that EVERYONE ELSE knows the celebrity

  public int findCelebrity(int n){
    int candidate = 0;
//container for the return
    for(int i = 1; i < n; i++){
      if(knows(candidate,i)){
        candidate = i;
      }
    }
//loops through array to see the candidate
//if the candidate changes, it means the previous candidate was invalidated
//1st loop finds the celebrity if it exists

    for(int i = 0; i < n; i++){
      if(i != candidate && knows(candidate,i) || !know(i,candidate)){
//if the candidate isnt the person we're on &&
//if the candidate knows the person we're on ||
//or i doesn't know the candidate
        return -1;
      }
    }
    return candidate;
  }
}

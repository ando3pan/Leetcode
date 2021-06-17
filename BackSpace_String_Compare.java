public Solution{
  public boolean backspaceCompare(String S, String T){
    Stack<Character> sStack = new Stack<Character>();
    for(char c: S.toCharArray()){
      if(c != '#'){
        sStack.push(c);
      }else if(!sStack.isEmpty()){
        sStack.pop();
      }
    }
    Stack<Character> tStack = new Stack<Character>();
    for(char c: T.toCharArray()){
      if(c != '#'){
        tStack.push(c);
      }else if (!tStack.isEmpty()){
        tStack.pop();
      }
    }
//    return sStack == tStack
    while(!sStack.isEmpty()){
//empty out the stacks to compare until they are empty
      char current = sStack.pop();
      if(tStack.isEmpty() || tStack.pop() != current){
        return false;
      }
    }
    return sStack.isEmpty() && sStack.isEmpty();
  }
}

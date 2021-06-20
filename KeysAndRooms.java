class Solution{
  public boolean canVisitAllRooms(List<List<Integer>> rooms){
    Hashset<Integer> visited = new HashSet<>();
    visited.add(0);
//keeps track of all the rooms we have visited
    Stack<Integer> stack = new Stack<>();
    stack.add(0);
//DFS needs a stack --> represents all our options
    while(!stack.isEmpty()){
      List<Integer> keys = rooms.get(stack.pop());
//pops out the keys that are in the room
      for(int key:keys){
        if(!visited.contains(key)){
          visited.add(key);
          stack.add(key);
//we visit a certain number of room
        }
      }
    }
    return visited.size() == rooms.size();
//checks if we visited the last room 
  }
}

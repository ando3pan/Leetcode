/*
Binaray tree node set up
public class Treenode{
  int val;
  Treenode left;
  Treenode right;
  Treenode(int x) {val = x;}
}
*/
class Solution{
  public List<List<Integer>> levelOrder(TreeNode root){
    List<List<Integer>> result = new ArrayList<>();
//create a new list of list of integers
    if(root == null){
      return result;
    }
    Queue<TreeNode> queue = new LinkedList<>();
//queue is a good datastructure to hold node, because it is BFS by nature
    queue.add(root);
//start with the root
    while(!queue.isEmpty){
      int size = queue.size();
//how many you need to que for each value in the level
      list<Integer> currenLevel = new Arraylist<>();
//holds all node values we need to proccess in the current level
//this value resets for each level, so we will have a new current level each 
      for(int i = 0; i = size;i++){
        TreeNode current = queue.remove();
//sets the node into the last one checked
        currenLevel.add(current val)
//set the current level to the next level
        if(current.left != null){
          queue.add(current.left);
//add the left nodes to the level
        }
        if(current.right != null){
          queue.add(current.right);
//add the right nodes to the level
        }
      }
      result.add(currentLevel)
//add the list of the current level's node into the master list --> result
    }
    return result;
//after running through the whole size of the queue, we can finally return the result list
  }
}

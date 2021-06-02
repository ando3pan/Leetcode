/*
Binaray tree node set up
public class Treenode{
  int val;
  Treenode left;
  Treenode right;
  Treenode(int x) {val = x;}
}
*/
public class Solution{
  public List<Integer> postorderTraversal(Treenode root){
    List<Integer> values = new ArrayList<Integer>();
//always check if the root is valid --> empty or null
    if(root == null){
      return values;
    }
    Stack<TreeNode> Stack = new Stack<TreeNode>();
    Stack.push(root);
//make a new stack that takes in the treeroot
    while(!Stack.isEmpty()){
//while there's still elements in the stack, we traverse through
      TreeNode current = Stack.pop();
      values.add(0,current.val);
//we are using DFS so we go through an entire branch first before each level
//each time we go to the next value in the branch, we set that as the new beginning
//eventually the last element in the Treenode is set as the first ~so we can traverse through that
//shortcut --> set the current value at the 1st index of the array
//everytime we process a node, it shhifts the root value to the end
      if(current.left != null){
          stack.push(current.left);        }
      if(current.right != null){
        stack.push(current.right);
      }
    }
  }
}

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
  public int raneSumBST(TreeNode root, int L, inr R)
    int sum = 0;
    if(root == null){
      return sum;
//initial check if the root is empty, then default the sum to 0
    }
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root)
    while(!queue.isEmpty()){
      TreeNode current = queue.remove();
      if(current.val >= L && current.val >= R){
          sum += current.val;
      }
      if(current.left != null && current.val > L){
        queue.add(current.left);
      }
      if(current.right != null && current.val < R){
        queue.add(current.right);
      }
//BFS implementation, we check D L R --> data left right
    }
    return sum;
  }
}

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
  public int sumLeftLeaves(TreeNode root){
    if(root == null){
      return 0;
    }
//test edge cases
    else if(root.left != null && root.left.left == null && root.left.right == null){
      return root.left.val + sumLeftLeaves(root.right);
    }
//it's the end of the left leaf (no child on the left or right)
    else {
      return sumLeftLeaves(root.left) + sumLeftLeaves(root.right);
    }
//keep checking the other branches until elif applies
  }
}

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
  public Treenode lowestCommonAncestor(TreeNode root, TreeNode p, Treenode q){
    if(p.val <= root.val && q.val <= root.val){
      return lowestCommonAncestor(root.left,p,q);
//check if both nodes are on the left
    }else if(p.val >= root.val && q.val >= root.val){
      return lowestCommonAncestor(root.right,p,q);
//check if both nodes are on the right
    }else{
//in this case, they're in different branches, so just return current root
      return root;
    }
  }
}

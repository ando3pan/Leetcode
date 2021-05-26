/*
Definition for binary tree node
public class treeNode{
  int val
  TReenode left
  Treenode Right
  Treenode (int x) {val = x;}

}

*/
class Solution{
  public boolen isSubtree(TreeNode s, TreeNode t){
    if (s == null){
      return false;
//if there's nothing, it obviously can't be a subtree
    }else if (isSametree(s,t)){
//if sametree returns true with the nodes, then subtree will return true as well
      return true;
    }else{
      return isSubtree(s.left,t) || isSubtree(s.right, t);
//keeping going through the trees to see if they match
    }
  }
  public boolean isSameTree(TreeNode s, TreeNode t){
    if (s==null || t==null){
//if either are null, they both have to be, so for the tree we have
//they can not have any more branches
      return s == null && t == null;
    }else if(s.val == t.val){
//comparison operation to match the leading tree
      return isSametree(s.left,t.left) && isSameTree(s.right,t.right);
//returns true only if both the left and right subtree are the isSametree
//returns a comparison operation that would show True or false
    }else{
      return false;
    }
//no matching? get rid of it

  }
}

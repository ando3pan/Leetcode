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
    }else if (isSametree(s,t)){
      return true;
    }else{
      return isSubtree(s.left,t) || isSubtree(s.right, t);
    }
  }
  public boolean isSameTree(TreeNode s, TreeNode t){
    if (s==null || t==null){
      return s == null && t ==null;
    }else if(s.val == t.val){
      return isSametree(s.left,t.left) && isSameTree(s.right,t.right);
    }else{
      return false;
    }

  }
}

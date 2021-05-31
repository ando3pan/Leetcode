/*
Binaray tree node set up
public class Treenode{
  int val;
  Treenode left;
  Treenode right;
  Treenode(int x) {val = x;}
}
*/
class solution{
  public List<String> binaryTreePath(Treenode Root){
    List<String> paths = new ArrayList<>();
    if(root == null){
      return paths;
    }
//run function to update paths to return to here
    dfs(root,"",paths)
//call function with input parameters
    return paths;
  }

  //make a recursive function that runs through a path in dfs

  public void dfs(TreeNode root,String path,List<String> paths){
    path += root.val;
  //start at the root and then do path.left and path.right to change
  //recursive statement means constant recalling of path+=  root.val
  //set the path into a string so we can traverse through it
    if(root.left == null && root.right == null){
      paths.add(path);
      return;
    }
  //if its the end of the path, you finally send back the completed path
    if(root.left != null){
      dfs(root.left,path + "->",paths);
  //when going to the left path you run the DFS again with updated parameters

    if(root.right != null){
      dfs(root.right,path + "->",paths);
  //when going to the right path you run the DFS again with updated parameters

    }
  }
}

import javax.swing.tree.TreeNode;
/**
 *
 * 968. Binary Tree Cameras
 * You are given the root of a binary tree. We install cameras on the tree nodes where each camera at a node can monitor its parent, itself, and its immediate children.
 *
 * Return the minimum number of cameras needed to monitor all nodes of the tree.
 * * * *
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
  public class BinaryTreeCamera {
  int ans = 0;
  public int minCameraCover(TreeNode root) {
    return dfs(root) > 2 ? ans + 1: ans;
  }

  public int dfs(TreeNode node){
    if(node == null) return 0;
    int val = dfs(node.left) + dfs(node.right);
    System.out.println(val);
    if(val == 0) return 3;
    if(val < 3) return 0;
    ans++;
    return 1;
  }
}

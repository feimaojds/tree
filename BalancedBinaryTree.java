package leecode;

public class BalancedBinaryTree {

public static int dfs(TreeNode root){

	if(root == null) return 0;
	
	int left = dfs(root.left);
	if(left == -1) return -1;
	int right = dfs(root.right);
	if(right == -1) return -1;
	
	
	if(Math.abs(left-right)>1) return -1;
	return Math.max(left, right)+1;
	
	
}
	
public boolean isBalanced(TreeNode root) {
         return dfs(root) == -1? false:true;
	   
    }
	class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
}

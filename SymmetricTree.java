package leecode;

public class SymmetricTree {

	
public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        else return helper(root.left, root.right);
    }
public boolean helper(TreeNode left,TreeNode right){
	if(left == null && right== null) return true;
	if(left ==null || right==null) return false;
	if(left.val == right.val){
		return helper(left.left, right.right) && helper(left.right, right.left);
	}
	return false;
}
	
	class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
}

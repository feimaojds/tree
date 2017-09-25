package leecode;

import java.util.ArrayList;
import java.util.List;

public class FlattenBinaryTreeToLinkedList {

	List<TreeNode> res = new ArrayList<TreeNode>();
	
	public void flatten(TreeNode root) {
		    if(root == null) return;
	        searchTree(root);
	        TreeNode head = root;
	          System.out.println(res.size());
	        head.left = null;
	        head.val = res.get(0).val;
	        for(int i=1;i<res.size();i++){
	        	head.right = res.get(i);
	            head = head.right;
	        }
	        
	    }

	public void searchTree(TreeNode root){
		if(root == null) return ;
		res.add(new TreeNode(root.val));
		if(root.left!=null) searchTree(root.left);
		if(root.right!=null) searchTree(root.right);
	}
	
	
	
	class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
}




package leecode;

import java.util.ArrayList;
import java.util.List;

public class PreOrderTraversal {
	
	List<Integer> res = new ArrayList<Integer>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null) return res;
        preSearch(root);
        return res;
    }
    
    public void preSearch(TreeNode root){
        if(root == null) return ;
        res.add(root.val);
        preSearch(root.left);
        preSearch(root.right);
    }
    
    class TreeNode {
    	      int val;
    	      TreeNode left;
    	      TreeNode right;
    	      TreeNode(int x) { val = x; }
    	  }

}

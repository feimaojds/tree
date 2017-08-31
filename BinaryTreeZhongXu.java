package leecode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeZhongXu {

	
public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode cur = root;
        while(cur!=null||!stack.empty()){
        	while(cur!=null){
        		stack.add(cur);
        		cur = cur.left;
        	}
        	cur = stack.pop();
        	res.add(cur.val);
        	cur = cur.right;
        }
        return res;
    }
	
	
	 class TreeNode {
		     int val;
		     TreeNode left;
		     TreeNode right;
		     TreeNode(int x) { val = x; }
		 }
}

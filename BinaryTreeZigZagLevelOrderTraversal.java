package leecode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeZigZagLevelOrderTraversal {
	 public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
	        List<List<Integer>> res = new ArrayList<>();
	        if(root == null) return res;
	        Queue<TreeNode> q = new LinkedList<TreeNode>();
	        q.add(root);
	        boolean flag = false;
	        while(!q.isEmpty()){
	            List<Integer> temp = new ArrayList<Integer>();
	            int n = q.size();
	            for(int i=0;i<n;i++){
	                if(q.peek().left!=null) q.add(q.peek().left);
	                if(q.peek().right!=null) q.add(q.peek().right);
	                if(flag == false) temp.add(q.poll().val);
	                else temp.add(0,q.poll().val);
	            }
	            res.add(temp);
	            flag = !flag;
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

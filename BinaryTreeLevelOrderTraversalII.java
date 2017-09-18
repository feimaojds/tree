package leecode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversalII {

	 public List<List<Integer>> levelOrderBottom(TreeNode root) {
		 List<List<Integer>> res = new ArrayList<>();
	     if(root == null) return res;
         Queue<TreeNode> q = new LinkedList<TreeNode>();
         q.add(root);
         while(!q.isEmpty()){
        	 int n = q.size();
        	 List<Integer> temp = new ArrayList<Integer>();
        	 int count = 0;
        	 for(int i=0;i<n;i++){
        		 
        		 if(q.peek().left!=null) q.add(q.peek().left);
        		 if(q.peek().right!=null) q.add(q.peek().right);
                 temp.add(q.poll().val);
        		 
        	 }
              
        	 res.add(0, temp);
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

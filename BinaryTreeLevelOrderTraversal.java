package leecode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {

public List<List<Integer>> levelOrder(TreeNode root) {
	    List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
	    Queue<TreeNode> queue = new LinkedList<TreeNode>();
	    queue.offer(root);
	    while(!queue.isEmpty()){
	    	int n = queue.size();
	    	List<Integer> temp = new ArrayList<Integer>();
	    	for(int i=0;i<n;i++){
	    		if(queue.peek().left != null) queue.offer(queue.peek().left);
	    		if(queue.peek().right !=null) queue.offer(queue.peek().right);
	    		temp.add(queue.poll().val);
	    	}
	    	res.add(temp);
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

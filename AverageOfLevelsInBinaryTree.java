package leecode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevelsInBinaryTree {
	
public List<Double> averageOfLevels(TreeNode root) {
        
	
	
	    List<Double> res = new ArrayList<Double>();
	    Queue<TreeNode> q = new LinkedList<>();
	    if(root == null) return res;
	    q.add(root);
	    while(!q.isEmpty()){
	    	int n = q.size();
	    	double sum = 0.0;
	    	for(int i=0;i<n;i++){
	    		TreeNode node = q.poll();
	    		sum = sum+node.val;
	    		if(node.left!=null) q.add(node.left);
	    		if(node.right!=null) q.add(node.right);
	    	}
	    	res.add(sum/n);
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

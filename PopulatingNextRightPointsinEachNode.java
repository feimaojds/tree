package leecode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class PopulatingNextRightPointsinEachNode {
 
	
	 public void connect(TreeLinkNode root) {
		    if(root == null) return;
	        Queue<TreeLinkNode> q = new LinkedList<TreeLinkNode>();
	        q.add(root);
	        while(!q.isEmpty()){
	        	int n = q.size();
	        	while(n!=0){ 	
	        		if(q.peek().left !=null ) q.add(q.peek().left);
		        	if(q.peek().right!=null) q.add(q.peek().right);
		        	if(n==1) q.poll().next = null;
	        		else q.poll().next = q.peek();
		        	n--;
	        	}
	        }
	    }
	
	
	
	
	class TreeLinkNode {
		      int val;
		      TreeLinkNode left, right, next;
		      TreeLinkNode(int x) { val = x; }
		  }
}

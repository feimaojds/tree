package leecode;

public class ConvertArrayToBinaryTree {

	
public TreeNode sortedArrayToBST(int[] nums) {
	if(nums == null || nums.length == 0 ) return null;
	TreeNode res  =  dfs(nums, 0, nums.length-1);
	return res;
	    
    }
public TreeNode dfs(int[] nums,int low,int high){
	while(low>high){
		return null;
	}
	int mid = low + (high-low)/2; 
	TreeNode root = new TreeNode(nums[mid]);
	root.left = dfs(nums, low, mid-1);
	root.right = dfs(nums, mid+1, high);
	return root;
}

class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
}

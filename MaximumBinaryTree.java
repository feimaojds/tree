package leecode;

public class MaximumBinaryTree {

	
	public TreeNode constructMaximumBinaryTree(int[] nums) {
        if(nums == null || nums.length == 0) return null;
        TreeNode root = build(nums, 0, nums.length-1);
        return root;
    }
 
 public TreeNode build(int[] nums,int start,int end){
	 if(start>end) return null;
	 int max = Integer.MIN_VALUE;
	 int maxPos = -1;
	 for(int i=start;i<=end;i++){
		 if(nums[i]>max){
             max = nums[i];
             maxPos = i;
         }
	 }
	 TreeNode root = new TreeNode(max);
	 root.left = build(nums, start, maxPos-1);
	 root.right = build(nums, maxPos+1, end);
	 
	 return root;
	 
 }
	
	class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
}

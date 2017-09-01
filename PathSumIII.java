package leecode;

public class PathSumIII {

	
public int pathSum(TreeNode root, int sum) {
        if(root==null) return 0;
        return findPath(root, sum)+pathSum(root.left, sum)+pathSum(root.right, sum);
       
    }

    public int findPath(TreeNode root,int sum){
    	int res = 0;
    	if(root==null) return 0;
    	if(root.val==sum) res++;
    	res+=findPath(root.left, sum-root.val);
    	res+=findPath(root.right, sum-root.val);
    	return res;
    }
	
	class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
}

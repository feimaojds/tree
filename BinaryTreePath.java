package leecode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePath {

public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<String>();
        if(root == null) return res;
        String path = "";
        dfs(res, path, root);
        return res;
    }
public void dfs(List<String> res,String path,TreeNode root){
	if(root.left == null && root.right ==null) res.add(path+root.val);
	if(root.left!=null) dfs(res, path+root.val+"->", root.left);
	if(root.right!=null) dfs(res, path+root.val+"->", root.right);
}
	
	
	
	class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
}

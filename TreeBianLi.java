package leecode;

import java.util.ArrayList;
import java.util.List;

import leecode.BinaryTreeZhongXu.TreeNode;

public class TreeBianLi {

	List<Integer> res = new ArrayList<Integer>();
    public List<Integer> bianLi(TreeNode root) {
        search1(root);
        search2(root);
        search3(root);
        return res;
    }
    public void search1(TreeNode root){//zhong
        if(root!=null){
            search1(root.left);
            res.add(root.val);
            search1(root.right);
        }
    } 
    public void search2(TreeNode root){//qian
    	if(root!=null){
    		res.add(root.val);
    		search2(root.left);
    		search2(root.right);
    	}
    }
    public void search3(TreeNode root){//hou
    	if(root!=null){
    		search3(root.left);
    		search3(root.right);
    		res.add(root.val);
    	}
    }
    class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
	 }
}

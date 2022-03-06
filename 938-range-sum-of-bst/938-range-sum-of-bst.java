/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
	 public int rangeSumBST(TreeNode root, int L, int R) {
		 int answer=0;
		 if(root!=null) {
			 if(root.val>=L && root.val <= R){
				 answer+=root.val;   
			 }
			 rangeSumBST(root.left,L,R);
			 rangeSumBST(root.right,L,R);
		 }
		 return answer;
	 }
}

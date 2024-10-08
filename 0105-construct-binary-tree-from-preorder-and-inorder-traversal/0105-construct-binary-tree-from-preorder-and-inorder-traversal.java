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
    private TreeNode solve(int[] preorder, int[] inorder, int[] index, int inorderStart, int inorderEnd, int n){
        if(index[0] >= n || inorderStart > inorderEnd)
            return null;
        int elem = preorder[index[0]++];
        TreeNode root = new TreeNode(elem);
        int pos = findPos(inorder, elem);

        root.left = solve(preorder, inorder, index, inorderStart, pos-1, n);
        root.right = solve(preorder, inorder, index, pos+1, inorderEnd, n);

        return root;
    }

    private int findPos(int[] inorder, int elem){
        for(int i=0; i<inorder.length; i++){
            if(inorder[i] == elem)
                return i;
        }
        return -1;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = inorder.length;
        int[] preorderIndex = {0};
        TreeNode ans = solve(preorder, inorder, preorderIndex, 0, n-1, n);
        return ans;
    }
}
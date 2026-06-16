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
    private int preorderIndex = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        // preorder means root first
        // inorder means root in middle
        Map<Integer , Integer> inOrderMap = new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            inOrderMap.put(inorder[i],i);
        }
        return helper(inOrderMap , preorder , 0 , inorder.length-1);
    }

    private TreeNode helper(Map<Integer , Integer> inOrderMap , int[] preorder , int start , int end ){
        if(start > end ){
            return null;
        }
        int rootValue = preorder[preorderIndex++];
        TreeNode rootNode = new TreeNode(rootValue);
        int rootIndex = inOrderMap.get(rootValue);
        rootNode.left = helper(inOrderMap , preorder , start , rootIndex-1);
        rootNode.right = helper(inOrderMap ,preorder , rootIndex+1 , end );
        return rootNode;
    }
}

class Solution {

    private int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        findMaxPath(root);
        return maxSum;
    }

    private int findMaxPath(TreeNode root) {

        
        if (root == null) {
            return 0;
        }

        
        int left = Math.max(0, findMaxPath(root.left));
        int right = Math.max(0, findMaxPath(root.right));

        
        int currentPathSum = root.val + left + right;

        
        maxSum = Math.max(maxSum, currentPathSum);

       
        return root.val + Math.max(left, right);
    }
}

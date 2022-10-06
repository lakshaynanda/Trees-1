
// TC: O(n)
// SC: O(h) h->height of tree
// Solved on Leetcode
// No problem faced
class Solution {
    TreeNode prev;
    public boolean isValidBST(TreeNode root) {
        Stack<TreeNode> s = new Stack<>();
        while (root != null || !s.isEmpty()) {
            while(root != null) {
                s.push(root);
                root = root.left;
            }
            root = s.pop();
            if (prev != null && prev.val >= root.val) {
                return false;
            }
            prev = root;
            root = root.right;
        }
        return true;
    }
}

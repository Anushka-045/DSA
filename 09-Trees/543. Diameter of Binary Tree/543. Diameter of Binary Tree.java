1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17
18    int diameter = 0;
19
20    public int diameterOfBinaryTree(TreeNode root) {
21        height(root);
22        return diameter;
23    }
24
25    public int height(TreeNode root) {
26
27        if(root == null) {
28            return 0;
29        }
30
31        int left = height(root.left);
32        int right = height(root.right);
33
34        diameter = Math.max(diameter, left + right);
35
36        return 1 + Math.max(left, right);
37    }
38}
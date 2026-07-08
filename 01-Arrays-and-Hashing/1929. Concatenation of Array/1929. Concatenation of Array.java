1class Solution {
2    public int[] getConcatenation(int[] nums) {
3        int n=nums.length;
4        int[] ans = new int[2*n];
5        for (int i = 0; i < n; i++) {
6             ans[i] = nums[i];
7             ans[i + n] = nums[i];
8
9        }
10        return ans;
11    }
12}
1class Solution {
2    public int firstMissingPositive(int[] nums) {
3        int n = nums.length;
4        boolean[] p = new boolean[n + 1];
5
6        for (int i : nums) {
7            if (i > 0 && i <= n) {
8                p[i] = true;
9            }
10        }
11        for (int i = 1; i <= n; i++) {
12            if (!p[i]) {
13                return i;
14            }
15        }
16        return n + 1;
17    }
18}
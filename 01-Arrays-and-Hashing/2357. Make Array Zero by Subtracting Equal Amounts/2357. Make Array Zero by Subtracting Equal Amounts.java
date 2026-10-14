1class Solution {
2    public int minimumOperations(int[] nums) {
3        HashSet<Integer> set = new HashSet<>();
4
5        for (int num : nums) {
6            if (num > 0) {
7                set.add(num);
8            }
9        }
10
11        return set.size();
12    }
13}
14
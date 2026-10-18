1class Solution {
2    public int findPeakElement(int[] nums) {
3        int max = nums[0];
4        int index = 0;
5
6        for (int i = 1; i < nums.length; i++) {
7            if (nums[i] > max) {
8                max = nums[i];
9                index = i;
10            }
11        }
12
13        return index;
14        
15    }
16}
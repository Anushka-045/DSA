1class Solution {
2    public int maxProduct(int[] nums) {
3        int maxP = nums[0];
4        int minP = nums[0];
5        int ans = nums[0];
6        for(int i=1;i<nums.length;i++){
7            int t=maxP;
8            maxP = Math.max(nums[i],Math.max(maxP * nums[i], minP * nums[i]));
9            minP = Math.min(nums[i],Math.min(t * nums[i], minP * nums[i]));
10            ans=Math.max(maxP,ans);
11        }
12        return ans; 
13    }
14}
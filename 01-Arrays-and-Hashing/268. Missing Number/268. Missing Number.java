1class Solution {
2    public int missingNumber(int[] nums) {
3        int n=nums.length;
4        int sum=0;
5        for(int i=0;i<n;i++){
6            sum+=nums[i];
7        }
8        int t=(n*(n+1))/2;
9        return t-sum;
10    }
11}
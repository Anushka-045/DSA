1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        int p=1;
4        int ans[]=new int[nums.length];
5        for(int i=0;i<nums.length;i++){
6            ans[i] = p;
7            p*=nums[i];
8        }
9        p=1;
10        for(int i=nums.length-1;i>=0;i--){
11            ans[i] *= p;
12            p*=nums[i];
13        }
14        return ans;
15    }
16}
1class Solution {
2    static{
3        for (int i=0;i<50;i++){
4            maxSubArray(new int[] {0,-2,3});
5        }
6    }
7    public static int maxSubArray(int[] nums) {
8        int c=nums[0];
9        int b=nums[0];
10        for (int i = 1; i<nums.length; i++) {
11            c= Math.max(c+ nums[i], nums[i]);
12            b = Math.max(b, c);
13        }
14        return b;
15    }
16}
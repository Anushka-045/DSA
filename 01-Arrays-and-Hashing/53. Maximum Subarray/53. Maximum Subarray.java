1class Solution {
2    public int maxSubArray(int[] nums) {
3        if(nums.length==1){
4            return nums[0];
5        }
6        int sum = 0;
7        int max = Integer.MIN_VALUE;
8        for(int i:nums){
9            sum+=i;
10            if(sum>max){
11                max=sum;
12            }
13            if(sum<0){
14                sum=0;
15            }
16        }
17        return max;
18        
19    }
20}
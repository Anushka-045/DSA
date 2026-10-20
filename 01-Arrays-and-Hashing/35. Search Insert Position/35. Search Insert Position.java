1class Solution {
2    public int searchInsert(int[] nums, int target) {
3        int l=0;
4        int r=nums.length-1;
5        while(l<=r){
6            int m=(l+r)/2;
7            if(nums[m]==target){
8                return m;
9            }
10            else if(nums[m]<target){
11                l=m+1;
12            }
13            else{
14                r=m-1;
15            }
16        }
17        return l;
18        
19    }
20}
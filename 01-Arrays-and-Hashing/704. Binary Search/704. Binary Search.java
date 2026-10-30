1class Solution {
2    public int search(int[] nums, int target) {
3        int l=0;
4        int r=nums.length-1;
5        while(l<=r){
6            int mid = l + (r - l) / 2;
7            if(nums[mid]==target){
8                return mid;
9            }
10            else if(nums[mid]>target){
11                r=mid-1;
12            }
13            else{
14                l=mid+1;
15            }
16        }
17        return -1;
18    }
19}
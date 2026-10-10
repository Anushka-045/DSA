1class Solution {
2    public int pivotIndex(int[] nums) {
3        int l=0;
4        int le[]=new int[nums.length];
5        for(int i=0;i<nums.length;i++){
6            le[i] = l;
7            l+=nums[i];
8        }
9        int r=0;
10        int ri[]=new int[nums.length];
11        for(int i=nums.length-1;i>=0;i--){
12            ri[i] = r;
13            r+=nums[i];
14        }
15        for(int i=0;i<nums.length;i++){
16            if(le[i]==ri[i]){
17                return i;
18            }
19        }
20        return -1;
21    }
22}
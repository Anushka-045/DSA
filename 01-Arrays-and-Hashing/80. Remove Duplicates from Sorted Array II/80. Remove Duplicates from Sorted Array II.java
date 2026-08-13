1class Solution {
2    public int removeDuplicates(int[] nums) {
3        if(nums.length<=2){
4            return nums.length;
5        }
6        int wi=2;
7        for(int i=2;i<nums.length;i++){
8            if(nums[i]!=nums[wi - 2]){
9                nums[wi] = nums[i];
10                wi++;
11            }
12        }
13        return wi;
14    }
15}
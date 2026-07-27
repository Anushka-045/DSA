1class Solution {
2    public List<Integer> findDisappearedNumbers(int[] nums) {
3        List<Integer> a=new  ArrayList<>();
4        for(int i: nums){
5            int idx = Math.abs(i) - 1;
6            if(nums[idx]>0){
7                nums[idx]=-nums[idx];
8            }
9        }
10        for(int j=0; j<nums.length;j++){
11            if(nums[j]>0){
12                a.add(j+1);
13            }
14        }
15        return a;
16        
17    }
18}
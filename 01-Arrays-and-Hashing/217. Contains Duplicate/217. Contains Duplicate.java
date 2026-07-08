1class Solution {
2    public boolean containsDuplicate(int[] nums) {
3        HashSet<Integer> seen = new HashSet<>();
4        for(int i: nums){
5            if(!seen.contains(i)){
6                seen.add(i);
7            }
8            else{
9                return true;
10            }
11        }
12        return false;
13    }
14}
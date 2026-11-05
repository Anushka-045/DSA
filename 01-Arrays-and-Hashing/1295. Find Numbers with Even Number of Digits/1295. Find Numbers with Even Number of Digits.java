1class Solution {
2    public int findNumbers(int[] nums) {
3        int c=0;
4        for(int i:nums){
5            if(((int) Math.log10(i) + 1)%2==0){
6                c++;
7            }
8        }
9        return c;
10        
11    }
12}
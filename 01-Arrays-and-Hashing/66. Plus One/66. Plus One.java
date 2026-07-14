1class Solution {
2    public int[] plusOne(int[] digits) {
3        for (int i = digits.length - 1; i >= 0; i--) {
4            if(digits[i]<9){
5                digits[i]++;
6                return digits;
7            }
8            digits[i] = 0;
9        }
10        int[] ans = new int[digits.length + 1];
11        ans[0] = 1;
12
13        return ans;     
14}
15}
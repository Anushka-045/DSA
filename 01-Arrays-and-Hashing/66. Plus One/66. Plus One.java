1class Solution {
2    public int[] plusOne(int[] digits) {
3        for(int i = digits.length-1; i >= 0; i--) {
4            if(digits[i] < 9) {
5                digits[i]++;
6                return digits;
7            }
8            digits[i] = 0;
9        }
10
11        int[] ans = new int[digits.length+1];
12        ans[0] = 1;
13        return ans;
14    }
15}
16// class Solution {
17//     public int[] plusOne(int[] digits) {
18//         long num = Arrays.stream(digits).reduce(0, (a, b) -> a * 10 + b)+1;
19//         int[] arr = String.valueOf(num).chars().map(c -> c - '0').toArray();
20//         return arr;
21//     }
22// }
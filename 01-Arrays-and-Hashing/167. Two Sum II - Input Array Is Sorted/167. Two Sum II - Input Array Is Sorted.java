1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3        int l= 0;
4        int r= numbers.length - 1;
5        while (l < r) {
6            int sum = numbers[l] + numbers[r];
7            if (sum == target) {
8                return new int[]{l + 1, r + 1};
9            } else if (sum < target) {
10                l++;
11            } else {
12                r--;
13            }
14        }
15
16        return new int[]{};   
17    }
18}
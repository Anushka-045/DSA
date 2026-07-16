1class Solution {
2    public int firstMissingPositive(int[] nums) {
3        int n = nums.length;
4        for(int i=0;i<n;i++){
5            if (nums[i] <= 0 || nums[i] > n) {
6                nums[i] = n + 1;
7            }
8        }
9        for (int i = 0; i < n; i++) {
10            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
11                int temp = nums[nums[i] - 1];
12                nums[nums[i] - 1] = nums[i];
13                nums[i] = temp;
14            }
15        }
16        for (int i = 0; i < n; i++) {
17            if (nums[i] != i + 1) {
18                return i + 1;
19            }
20        }
21        return n + 1;
22    }
23}
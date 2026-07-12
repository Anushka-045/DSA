1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> threeSum(int[] nums) {
5        List<List<Integer>> ans = new ArrayList<>();
6        Arrays.sort(nums); 
7        for (int i = 0; i < nums.length - 2; i++) {
8            if (i > 0 && nums[i] == nums[i - 1]) continue;
9            int l = i + 1, r = nums.length - 1;
10            while (l < r) {
11                int s = nums[i] + nums[l] + nums[r];
12                if (s == 0) {
13                    ans.add(Arrays.asList(nums[i], nums[l], nums[r])); 
14                    l++;
15                    r--;
16                    while (l < r && nums[l] == nums[l - 1]) l++;
17                    while (l < r && nums[r] == nums[r + 1]) r--;
18                } else if (s > 0) {
19                    r--;
20                } else {
21                    l++;
22                }
23            }
24        }
25        return ans;
26    }
27}
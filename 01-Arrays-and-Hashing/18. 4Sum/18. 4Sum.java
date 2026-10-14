1class Solution {
2    public List<List<Integer>> fourSum(int[] nums, int target) {
3        List<List<Integer>> ans = new ArrayList<>();
4        Arrays.sort(nums);
5
6        int n = nums.length;
7
8        for (int i = 0; i < n - 3; i++) {
9
10            // Skip duplicate first elements
11            if (i > 0 && nums[i] == nums[i - 1]) {
12                continue;
13            }
14
15            for (int j = i + 1; j < n - 2; j++) {
16
17                // Skip duplicate second elements
18                if (j > i + 1 && nums[j] == nums[j - 1]) {
19                    continue;
20                }
21
22                int k = j + 1;
23                int l = n - 1;
24
25                while (k < l) {
26                    // Use long to avoid integer overflow
27                    long sum = (long) nums[i] + nums[j]
28                             + nums[k] + nums[l];
29
30                    if (sum == target) {
31                        ans.add(Arrays.asList(
32                            nums[i], nums[j], nums[k], nums[l]
33                        ));
34
35                        k++;
36                        l--;
37
38                        // Skip duplicate third elements
39                        while (k < l && nums[k] == nums[k - 1]) {
40                            k++;
41                        }
42
43                        // Skip duplicate fourth elements
44                        while (k < l && nums[l] == nums[l + 1]) {
45                            l--;
46                        }
47                    } 
48                    else if (sum < target) {
49                        k++;
50                    } 
51                    else {
52                        l--;
53                    }
54                }
55            }
56        }
57
58        return ans;
59    }
60}
61
1
2class Solution {
3    public int[] searchRange(int[] nums, int target) {
4        int first = findFirst(nums, target);
5        int last = findLast(nums, target);
6
7        return new int[]{first, last};
8    }
9
10    public int findFirst(int[] nums, int target) {
11        int l = 0, r = nums.length - 1;
12        int ans = -1;
13
14        while (l <= r) {
15            int mid = l + (r - l) / 2;
16
17            if (nums[mid] == target) {
18                ans = mid;
19                r = mid - 1;
20            } else if (nums[mid] < target) {
21                l = mid + 1;
22            } else {
23                r = mid - 1;
24            }
25        }
26        return ans;
27    }
28
29    public int findLast(int[] nums, int target) {
30        int l = 0, r = nums.length - 1;
31        int ans = -1;
32
33        while (l <= r) {
34            int mid = l + (r - l) / 2;
35
36            if (nums[mid] == target) {
37                ans = mid;
38                l = mid + 1;
39            } else if (nums[mid] < target) {
40                l = mid + 1;
41            } else {
42                r = mid - 1;
43            }
44        }
45        return ans;
46    }
47}
48
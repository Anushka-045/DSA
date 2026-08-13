1// class Solution {
2//     public int[] searchRange(int[] nums, int target) {
3//         int f = Arrays.binarySearch(nums, target);
4//         if (f < 0) {
5//             return new int[]{-1, -1};
6//         }
7
8//         int start = f, end = f;
9//         while (start > 0 && nums[start - 1] == target) {
10//             start--;
11//         }
12//         while (end < nums.length - 1 && nums[end + 1] == target) {
13//             end++;
14//         }
15
16//         return new int[]{start, end};
17//     }
18// }
19class Solution {
20    public int[] searchRange(int[] nums, int target) {
21        int first = fb(nums, target, true);
22        int last = fb(nums, target, false);
23        return new int[]{first, last};
24    }
25    private int fb(int[] nums, int target, boolean f) {
26        int left = 0, right = nums.length - 1;
27        int res = -1;
28        
29        while (left <= right) {
30            int mid = left + (right - left) / 2;
31            
32            if (nums[mid] == target) {
33                res = mid;  
34                if (f) {
35                    right = mid - 1;   
36                } else {
37                    left = mid + 1;   
38                }
39            } else if (nums[mid] < target) {
40                left = mid + 1;
41            } else {
42                right = mid - 1;
43            }
44        }
45        return res;
46    }
47}
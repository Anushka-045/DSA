1// class Solution {
2//     public int singleNonDuplicate(int[] nums) {
3//         HashMap<Integer, Integer> map = new HashMap<>();
4//         for (int num :nums) {
5//             map.put(num, map.getOrDefault(num, 0) + 1);
6//         }
7//         for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
8//             if(entry.getValue()==1){
9//                 return entry.getKey();
10//             }
11//         }
12//         return -1;
13//     }
14// }
15
16class Solution {
17    public int singleNonDuplicate(int[] nums) {
18        int l = 0, r = nums.length - 1;
19
20        while (l < r) {
21            int mid = l + (r - l) / 2;
22            if (mid % 2 == 1) {
23                mid--;
24            }
25            if (nums[mid] == nums[mid + 1]) {
26                l = mid + 2;
27            } else {
28                r = mid;
29            }
30        }
31        return nums[l];
32    }
33}
34
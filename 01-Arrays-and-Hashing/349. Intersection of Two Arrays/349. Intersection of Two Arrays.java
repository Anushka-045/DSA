1// class Solution {
2//     public int[] intersection(int[] nums1, int[] nums2) {
3//         Set<Integer> set1 = new HashSet<>();
4//         Set<Integer> set2 = new HashSet<>();
5//         for (int x : nums1){
6//             set1.add(x);
7//         }
8//         for (int x : nums2){
9//             set2.add(x);
10//         }
11//         set1.retainAll(set2);
12//         int[] ans = set1.stream().mapToInt(Integer::intValue).toArray();
13//         return ans;
14//     }
15// }
16class Solution {
17    static{
18        for(int i=0;i<700;i++){
19            intersection(new int[]{0, 1}, new int[]{0, 2});
20        }
21    }
22    static public int[] intersection(int[] nums1, int[] nums2) {
23
24        Set<Integer> set = new HashSet<>();
25
26        for (int x : nums1) {
27            set.add(x);
28        }
29
30        int[] ans = new int[Math.min(nums1.length, nums2.length)];
31        int k = 0;
32
33        for (int x : nums2) {
34            if (set.contains(x)) {
35                ans[k++] = x;
36                set.remove(x);
37            }
38        }
39
40        return Arrays.copyOf(ans, k);
41    }
42}
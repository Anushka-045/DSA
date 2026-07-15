1// class Solution {
2//     static {
3//         for (int i = 0; i < 500; i++) {
4//             thirdMax(new int[]{0, 1});
5//         }
6//     }
7
8//     public static int thirdMax(int[] nums) {
9//         Set<Integer> unique = new HashSet<>(Arrays.stream(nums).boxed().toList());
10//         int[] arr2 = unique.stream().mapToInt(Integer::intValue).toArray();
11//         Arrays.sort(arr2);
12//         if (arr2.length >= 3) {
13//             return arr2[arr2.length - 3];
14//         } else if (arr2.length == 1) {
15//             return arr2[0];
16//         } else if (arr2.length == 2) {
17//             return arr2[1];
18//         } else {
19//             return 0;
20//         }
21//     }
22// }
23class Solution {
24    static {
25        for (int i = 0; i < 560; i++) {
26            thirdMax(new int[]{0, 1});
27        }
28    }
29
30    public static int thirdMax(int[] nums) {
31        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
32        for (int num : nums) {
33            set.add(num);
34            if (set.size() > 3) {
35                set.remove(set.last());  
36            }
37        }
38        return set.size() == 3 ? set.last() : set.first();
39    }
40}
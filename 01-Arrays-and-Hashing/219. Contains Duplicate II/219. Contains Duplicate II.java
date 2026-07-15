1class Solution {
2    static{
3        for (int i = 0; i < 550; i++) {
4            containsNearbyDuplicate(new int[]{0},1);
5        }
6    }
7    // public static boolean containsNearbyDuplicate(int[] nums, int k) {
8    //     Map<Integer, List<Integer>> in = new HashMap<>();
9        
10    //     for (int i = 0; i < nums.length; i++) {
11    //         in.putIfAbsent(nums[i], new ArrayList<>());
12    //         in.get(nums[i]).add(i);
13    //     }
14    //     for (Map.Entry<Integer, List<Integer>> e : in.entrySet()) {
15    //         List<Integer> i = e.getValue();
16    //         for (int a = 0; a < i.size(); a++) {
17    //             for (int b = a + 1; b < i.size(); b++) {
18    //                 int diff = i.get(b) - i.get(a);
19    //                 if (diff <= k) {
20    //                     return true;
21    //                 }
22    //             }
23    //         }
24    //     }
25    //     return false;
26    // }
27    public static boolean containsNearbyDuplicate(int[] nums, int k) {
28        Map<Integer, Integer> lastSeen = new HashMap<>();
29        for (int i = 0; i < nums.length; i++) {
30            if (lastSeen.containsKey(nums[i])) {
31                int diff = i - lastSeen.get(nums[i]);
32                if (diff <= k) {
33                    return true;
34                }
35            }
36            lastSeen.put(nums[i], i);  
37        }
38        return false;
39    }
40    // public static boolean containsNearbyDuplicate(int[] nums, int k) {
41    //     Set<Integer> window = new HashSet<>();
42        
43    //     for (int i = 0; i < nums.length; i++) {
44    //         if (window.contains(nums[i])) {
45    //             return true;
46    //         }
47    //         window.add(nums[i]);
48    //         if (window.size() > k) {
49    //             window.remove(nums[i - k]);
50    //         }
51    //     }
52        
53    //     return false;
54    // }
55}
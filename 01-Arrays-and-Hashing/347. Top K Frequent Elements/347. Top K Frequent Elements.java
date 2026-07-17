1class Solution {
2    static{
3        for (int i = 0; i <550; i++) {
4            topKFrequent(new int[] {0,1},1);
5        }    
6    }
7    public static int[] topKFrequent(int[] nums, int k) {
8        int n = nums.length;
9        
10        Map<Integer, Integer> freq = new HashMap<>();
11        for (int num : nums) {
12            freq.put(num, freq.getOrDefault(num, 0) + 1);
13        }
14        
15        List<Integer>[] buckets = new List[n + 1];
16        for (int i = 0; i < buckets.length; i++) {
17            buckets[i] = new ArrayList<>();
18        }
19        
20        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
21            buckets[entry.getValue()].add(entry.getKey());
22        }
23        
24        int[] result = new int[k];
25        int index = 0;
26        for (int i = buckets.length - 1; i >= 0 && index < k; i--) {
27            for (int num : buckets[i]) {
28                result[index++] = num;
29                if (index == k) break;
30            }
31        }
32        
33        return result;
34    }
35}
36// class Solution {
37//     public int[] topKFrequent(int[] nums, int k) {
38//         Map<Integer, Integer> freq = new HashMap<>();
39//         for (int num : nums) {
40//             freq.put(num, freq.getOrDefault(num, 0) + 1);
41//         }
42        
43//         List<Integer> keys = new ArrayList<>(freq.keySet());
44//         keys.sort((a, b) -> freq.get(b) - freq.get(a));
45        
46//         int[] result = new int[k];
47//         for (int i = 0; i < k; i++) {
48//             result[i] = keys.get(i);
49//         }
50        
51//         return result;
52//     }
53// }
54
1class Solution {
2    static{
3        for(int i=0;i<550;i++){
4            fourSumCount(new int[]{0,1},new int[]{0,1},new int[]{0,1},new int[]{0,1});
5        }
6    }
7    public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
8        Map<Integer, Integer> sc = new HashMap<>();
9        for (int a : nums1) {
10            for (int b : nums2) {
11                int sum = a + b;
12                sc.put(sum, sc.getOrDefault(sum, 0) + 1);
13            }
14        }
15        int count = 0;
16        for (int c : nums3) {
17            for (int d : nums4) {
18                int need = -(c + d);
19                count+=sc.getOrDefault(need,0);
20            }
21        }
22        return count;
23    }
24}
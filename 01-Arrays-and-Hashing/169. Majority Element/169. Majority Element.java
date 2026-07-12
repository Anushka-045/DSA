1class Solution {
2    public int majorityElement(int[] nums) {
3        HashMap<Integer, Integer> l = new HashMap<>();
4        for (int num : nums) {
5            l.put(num, l.getOrDefault(num, 0) + 1);
6        }
7        for (Map.Entry<Integer, Integer> entry : l.entrySet()){
8            if (entry.getValue() > nums.length / 2) {
9                return entry.getKey();
10            }
11        }
12        return 0;
13    }
14}
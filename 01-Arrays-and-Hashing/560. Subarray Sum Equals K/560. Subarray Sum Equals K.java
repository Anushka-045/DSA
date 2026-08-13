1class Solution {
2    public int subarraySum(int[] nums, int k) {
3        int c = 0;
4        int cu = 0;
5        HashMap<Integer, Integer> m = new HashMap<>();
6        m.put(0,1);
7        for(int i : nums){
8            cu+=i;
9            int n = cu - k;
10            if(m.containsKey(n)){
11                c+=m.get(n);
12            }
13            m.put(cu, m.getOrDefault(cu, 0) + 1);
14        }
15        return c;
16    }
17}
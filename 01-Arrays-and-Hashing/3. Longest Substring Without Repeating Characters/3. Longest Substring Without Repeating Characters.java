1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        HashSet<Character> set = new HashSet<>();
4        int l = 0;
5        int count = 0;
6        int ans = 0;
7        for (int r = 0; r< s.length(); r++) {
8            while (set.contains(s.charAt(r))) {
9                set.remove(s.charAt(l));
10                l++;
11                count--;
12            }
13            set.add(s.charAt(r));
14            count++;
15            ans = Math.max(ans, count);
16        }
17        return ans;
18    }
19}
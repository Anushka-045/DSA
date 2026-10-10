1class Solution {
2    public String longestPalindrome(String s) {
3        int start = 0;
4        int maxLen = 1;
5        for (int i = 0; i < s.length(); i++) {
6            int l = i;
7            int r = i;
8            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
9                if (r - l + 1 > maxLen) {
10                    start = l;
11                    maxLen = r - l + 1;
12                }
13                l--;
14                r++;
15            }
16            l = i;
17            r = i + 1;
18            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
19                if (r - l + 1 > maxLen) {
20                    start = l;
21                    maxLen = r - l + 1;
22                }
23                l--;
24                r++;
25            }
26        }
27        return s.substring(start, start + maxLen);
28    }
29}
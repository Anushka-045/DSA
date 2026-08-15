1class Solution {
2    static {
3        Solution sol=new Solution();
4        for(int i=0;i<1000;i++)
5        {
6            sol.findTheDifference(heow,how);
7        }
8     }
9    public static char findTheDifference(String s, String t) {
10        int su= 0;
11        int sum= 0;
12        for (int i = 0; i < s.length(); i++) {
13            su += s.charAt(i);
14        }
15        for (int i = 0; i < t.length(); i++) {
16            sum += t.charAt(i);
17        }
18        return (char) Math.abs(su-sum);
19
20
21
22    }
23}
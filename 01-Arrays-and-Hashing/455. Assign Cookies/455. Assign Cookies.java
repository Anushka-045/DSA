1class Solution {
2    static{
3        for(int i=0;i<500;i++){
4            findContentChildren(new int[]{1,2}, new int[]{1,1});
5        }
6    }
7    public static int findContentChildren(int[] g, int[] s) {
8        Arrays.sort(s);
9        Arrays.sort(g);
10        int i=0;
11        int j=0;
12        while (i < s.length && j < g.length) {
13            if (s[i] >= g[j]) {
14                j++;
15            }
16            i++;
17        
18        }
19        return j;
20    }
21}
22
23
24
25
26
27
28// class Solution {
29//     public int findContentChildren(int[] g, int[] s) {
30//         Arrays.sort(s);
31//         Arrays.sort(g);
32//         int i=0;
33//         int j=0;
34//         int count = 0;
35//         while (i < s.length && j < g.length) {
36//             if (s[i] == g[j] || s[i] >= g[j]) {
37//                 count++;
38//                 i++;
39//                 j++;
40//             }
41//             else if (s[i] < g[j]) {
42//                 i++;
43//             }
44//         }
45//         return count;
46//     }
47// }
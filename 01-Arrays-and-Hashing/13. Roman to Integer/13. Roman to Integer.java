1
2// class Solution {
3//     public int romanToInt(String s) {
4//         int sum = 0;
5
6//         for (int i = 0; i < s.length(); i++) {
7//             char ch = s.charAt(i);
8//             int curr = 0;
9//             char n = ' ';
10
11//             switch (ch) {
12//                 case 'I': curr = 1; break;
13//                 case 'V': curr = 5; break;
14//                 case 'X': curr = 10; break;
15//                 case 'L': curr = 50; break;
16//                 case 'C': curr = 100; break;
17//                 case 'D': curr = 500; break;
18//                 case 'M': curr = 1000; break;
19//             }
20
21//             if (i + 1 < s.length()) {
22//                 n = s.charAt(i + 1);
23//             }
24
25//             if ((ch == 'I' && (n == 'V' || n == 'X')) ||
26//                 (ch == 'X' && (n == 'L' || n == 'C')) ||
27//                 (ch == 'C' && (n == 'D' || n == 'M'))) {
28//                 sum -= curr;
29//             } else {
30//                 sum += curr;
31//             }
32//         }
33
34//         return sum;
35//     }
36// }
37
38class Solution {
39    private static final int[] values = new int[128];
40
41    static {
42        values['I'] = 1;
43        values['V'] = 5;
44        values['X'] = 10;
45        values['L'] = 50;
46        values['C'] = 100;
47        values['D'] = 500;
48        values['M'] = 1000;
49    }
50
51    public int romanToInt(String s) {
52        int sum = 0;
53        int n = s.length();
54
55        for (int i = 0; i < n; i++) {
56            int curr = values[s.charAt(i)];
57
58            if (i + 1 < n && curr < values[s.charAt(i + 1)]) {
59                sum -= curr;
60            } else {
61                sum += curr;
62            }
63        }
64
65        return sum;
66    }
67}
68
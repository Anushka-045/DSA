1
2class Solution {
3    public int romanToInt(String s) {
4        int sum = 0;
5
6        for (int i = 0; i < s.length(); i++) {
7            char ch = s.charAt(i);
8            int curr = 0;
9            char n = ' ';
10
11            switch (ch) {
12                case 'I': curr = 1; break;
13                case 'V': curr = 5; break;
14                case 'X': curr = 10; break;
15                case 'L': curr = 50; break;
16                case 'C': curr = 100; break;
17                case 'D': curr = 500; break;
18                case 'M': curr = 1000; break;
19            }
20
21            if (i + 1 < s.length()) {
22                n = s.charAt(i + 1);
23            }
24
25            if ((ch == 'I' && (n == 'V' || n == 'X')) ||
26                (ch == 'X' && (n == 'L' || n == 'C')) ||
27                (ch == 'C' && (n == 'D' || n == 'M'))) {
28                sum -= curr;
29            } else {
30                sum += curr;
31            }
32        }
33
34        return sum;
35    }
36}
37
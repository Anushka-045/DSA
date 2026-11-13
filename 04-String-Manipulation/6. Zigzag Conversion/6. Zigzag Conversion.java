1// class Solution {
2//     public String convert(String s, int numRows) {
3//         if(numRows == 1 || numRows >= s.length()) {
4//             return s;
5//         }
6//         int rows = numRows;
7//         int cols = s.length();
8//         int r = 0, c = 0;
9//         boolean down = true;
10
11//         char[][] arr = new char[rows][cols];
12//         StringBuilder ans = new StringBuilder();
13
14//         for(int i = 0; i < s.length(); i++) {
15//             arr[r][c] = s.charAt(i);
16
17//             if(down) {
18//                 if(r < rows - 1) {
19//                     r++;
20//                 }
21//                 else {
22//                     down = false;
23//                     r--;
24//                     c++;
25//                 }
26//             }
27//             else {
28//                 if(r == 0) {
29//                     down = true;
30//                     r++;
31//                 }
32//                 else {
33//                     r--;
34//                     c++;
35//                 }
36//             }
37//         }
38
39//         for(int i = 0; i < rows; i++) {
40//             for(int j = 0; j < cols; j++) {
41//                 if(arr[i][j] != '\u0000') {
42//                     ans.append(arr[i][j]);
43//                 }
44//             }
45//         }
46
47//         return ans.toString();
48//     }
49// }
50class Solution {
51    public String convert(String s, int numRows) {
52        if (numRows == 1 || s.length() <= numRows) return s;
53        int n = s.length();
54        char[] result = new char[n];
55        int idx = 0;
56        int c= 2 * numRows - 2;
57        for (int row = 0; row < numRows; row++) {
58            for (int j = row; j < n; j += c) {
59                result[idx++] = s.charAt(j);
60                int diagIndex = j + c - 2 * row;
61                if (row != 0 && row != numRows - 1 && diagIndex < n) {
62                    result[idx++] = s.charAt(diagIndex);
63                }
64            }
65        }
66        return new String(result);
67    }
68}
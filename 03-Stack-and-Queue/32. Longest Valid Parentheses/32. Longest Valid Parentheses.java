1// 
2class Solution {
3    public int longestValidParentheses(String s) {
4        int n = s.length();
5        int[] stack = new int[n + 1];
6        int top = -1;
7
8        stack[++top] = -1;   
9        int maxLen = 0;
10
11        for (int i = 0; i < n; i++) {
12            char c = s.charAt(i);
13
14            if (c == '(') {
15                stack[++top] = i;      
16            } else {
17                top--;                
18
19                if (top == -1) {
20                    stack[++top] = i;  
21                } else {
22                    maxLen = Math.max(maxLen, i - stack[top]);  
23                }
24            }
25        }
26
27        return maxLen;
28    }
29}
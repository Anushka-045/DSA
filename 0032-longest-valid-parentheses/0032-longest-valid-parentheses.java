// 
class Solution {
    public int longestValidParentheses(String s) {
        int n = s.length();
        int[] stack = new int[n + 1];
        int top = -1;

        stack[++top] = -1;   
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            if (c == '(') {
                stack[++top] = i;      
            } else {
                top--;                

                if (top == -1) {
                    stack[++top] = i;  
                } else {
                    maxLen = Math.max(maxLen, i - stack[top]);  
                }
            }
        }

        return maxLen;
    }
}
1// class Solution {
2//     public int[] dailyTemperatures(int[] temperatures) {
3//         int n = temperatures.length;
4//         int[] arr = new int[n];
5//         // Stack<Integer> st = new Stack<>();
6//         Deque<Integer> st = new ArrayDeque<>();
7//         for(int i = 0; i < n; i++) {
8//             while(!st.isEmpty() && temperatures[st.peek()] < temperatures[i]) {
9//                 arr[st.peek()] = i - st.peek();
10//                 st.pop();
11//             }
12//             st.push(i);
13//         }
14//         return arr;
15//     }
16// }
17class Solution {
18    public int[] dailyTemperatures(int[] temperatures) {
19        int n = temperatures.length;
20        int[] ans = new int[n];
21        int[] st = new int[n];
22        int top = -1;
23        for (int i = 0; i < n; i++) {
24            while (top >= 0 && temperatures[st[top]] < temperatures[i]) {
25                int idx = st[top--];
26                ans[idx] = i - idx;
27            }
28            st[++top] = i;
29        }
30
31        return ans;
32    }
33}
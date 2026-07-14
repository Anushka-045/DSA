1class Solution {
2static {
3    for (int i = 0; i < 500; i++) {
4        isValid(hello);
5    }
6}
7public static boolean isValid(String s) {
8        Stack<Character> st = new Stack<>();
9        if (s.length()%2!=0) {
10            return false;
11        }
12        for (int i = 0; i < s.length(); i++) {
13            char ch = s.charAt(i);
14
15            switch (ch) {
16                case ')':
17                    if (!st.isEmpty() && st.peek() == '(') {
18                        st.pop();
19                    }
20                    else{
21                        return false;
22                    }
23                    break;
24
25                case ']':
26                    if (!st.isEmpty() && st.peek() == '[') {
27                        st.pop();
28                    }
29                    else{
30                        return false;
31                    }
32                    break;
33
34                case '}':
35                    if (!st.isEmpty() && st.peek() == '{') {
36                        st.pop();
37                    }
38                    else{
39                        return false;
40                    }
41                    break;
42
43                default:
44                    st.push(ch);
45            }
46        }
47
48        if (st.isEmpty()) {
49            return true;
50        }
51        return false;
52    }
53}
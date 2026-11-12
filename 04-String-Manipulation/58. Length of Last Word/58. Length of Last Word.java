1class Solution {
2    public int lengthOfLastWord(String s) {
3        int c=0;
4        for(int i= s.length()-1;i>=0;i--){
5            char ch = s.charAt(i);
6            if (ch != ' ') {
7                c++;
8            }
9            else if (c > 0) {
10                break;
11            }
12
13        }
14        return c;
15    }
16}
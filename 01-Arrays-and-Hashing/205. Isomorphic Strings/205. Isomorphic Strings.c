1
2/*class Solution {
3    public boolean isIsomorphic(String s, String t) {
4        if (s.length() != t.length()) {
5            return false;
6        }
7        HashMap<Character, Character>  m= new HashMap<>();
8        HashMap<Character, Character>  p= new HashMap<>();
9        for (int i=0;i<s.length();i++){
10            if(m.containsKey(s.charAt(i))){
11                if(m.get(s.charAt(i)) != t.charAt(i)){
12                    return false;
13                }
14            }
15            else{
16                m.put(s.charAt(i), t.charAt(i));
17            }
18        }
19        for (int i=0;i<t.length();i++){
20            if(p.containsKey(t.charAt(i))){
21                if(p.get(t.charAt(i)) != s.charAt(i)){
22                    return false;
23                }
24            }
25            else{
26                p.put(t.charAt(i), s.charAt(i));
27            }
28        }
29        return true;
30    }
31}*/
32class Solution {
33    public boolean isIsomorphic(String s, String t) {
34        if (s.length() != t.length()) {
35            return false;
36        }
37        
38        int[] m = new int[256];
39        int[] p = new int[256];
40        
41        Arrays.fill(m, -1);
42        Arrays.fill(p, -1);
43        
44        for (int i = 0; i < s.length(); i++) {
45            char c1 = s.charAt(i);
46            char c2 = t.charAt(i);
47            
48            if (m[c1] == -1) {
49                m[c1] = c2;
50            } else if (m[c1] != c2) {
51                return false;
52            }
53            
54            if (p[c2] == -1) {
55                p[c2] = c1;
56            } else if (p[c2] != c1) {
57                return false;
58            }
59        }
60        
61        return true;
62    }
63}
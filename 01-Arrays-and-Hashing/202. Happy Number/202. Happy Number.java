1class Solution {
2    public boolean isHappy(int n) {
3        int s = 0;
4        ArrayList<Integer> l = new ArrayList<>();
5        ArrayList<Integer> se = new ArrayList<>();  
6
7        while (n != 1 && !se.contains(n)) {      
8            se.add(n);                            
9            while (n > 0) {
10                int d = n % 10;
11                l.add(d);
12                n = n / 10;
13            }
14            for (int i : l) {
15                s += i * i;
16            }
17            n = s;
18            s = 0;
19            l.clear();
20        }
21
22        return n == 1;
23    }
24}
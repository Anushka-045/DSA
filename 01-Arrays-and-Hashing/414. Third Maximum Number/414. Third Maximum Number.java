1import java.util.*;
2
3class Solution {
4    public int thirdMax(int[] nums) {
5        TreeSet<Integer> set = new TreeSet<>();
6        for (int n : nums) set.add(n);  
7        if (set.size() >= 3) {
8            set.pollLast();             
9            set.pollLast();              
10            return set.last();          
11        }
12        return set.last();               
13    }
14}
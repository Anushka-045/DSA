1import java.util.*;
2
3class Solution {
4    public int findKthLargest(int[] nums, int k) {
5        PriorityQueue<Integer> pq = new PriorityQueue<>();
6        for (int num : nums) {
7            pq.offer(num);
8            if (pq.size() > k) {
9                pq.poll();
10            }
11        }
12        return pq.peek();
13    }
14}
1class Solution {
2    public int[][] merge(int[][] intervals) {
3        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
4        ArrayList<int[]> ans = new ArrayList<>();
5        int start = intervals[0][0];
6        int end = intervals[0][1];
7        for(int i = 1; i < intervals.length; i++) {
8            if(end >= intervals[i][0]) {
9                end = Math.max(end, intervals[i][1]);
10            }
11            else {
12                ans.add(new int[]{start, end});
13                start = intervals[i][0];
14                end = intervals[i][1];
15            }
16        }
17        ans.add(new int[]{start, end});
18        return ans.toArray(new int[ans.size()][]);
19    }
20}
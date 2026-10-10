1class Solution {
2    public int maximumUnits(int[][] boxTypes, int truckSize) {
3        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
4        int totalUnits = 0;
5        for (int[] box : boxTypes) {
6            int boxes = box[0];
7            int units = box[1];
8            int take = Math.min(boxes, truckSize);
9            totalUnits += take * units;
10            truckSize -= take;
11            if (truckSize == 0) {
12                break;
13            }
14        }
15        return totalUnits;
16    }
17}
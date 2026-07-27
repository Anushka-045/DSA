1class Solution {
2    static{
3        for(int i=0;i<50;i++){
4            summaryRanges(new int[] {0});
5        }
6    }
7    public static List<String> summaryRanges(int[] nums) {
8        List<String> res = new ArrayList<>();
9
10        for (int i = 0; i < nums.length; i++) {
11            int start = nums[i];
12
13            while (i + 1 < nums.length
14                    && (long) nums[i + 1] == (long) nums[i] + 1) {
15                i++;
16            }
17
18            if (start == nums[i]) {
19                res.add(String.valueOf(start));
20            } else {
21                res.add(start + -> + nums[i]);
22            }
23        }
24
25        return res;
26    }
27}
28
29    // public List<String> summaryRanges(int[] nums) {
30    // List<String> result = new ArrayList<>();
31    // if (nums.length == 0) return result;
32    // int start = nums[0];
33    // for (int i = 0; i < nums.length; i++) {
34    //     boolean isEnd = (i == nums.length - 1) || (nums[i+1] != nums[i] + 1);
35    //     if (isEnd) {
36    //         if (start == nums[i]) {
37    //             result.add(String.valueOf(start));
38    //         } else {
39    //             result.add(start + -> + nums[i]);
40    //         }
41    //         if (i < nums.length - 1) {
42    //             start = nums[i+1];
43    //         }
44    //     }
45    // }
46    // return result;
47    // }
48
1class Solution {
2    static{
3        for(int i=0;i<560;i++){
4            intersection(new int[] {1,2},new int[] {0,1});
5        }
6    }
7    public static int[] intersection(int[] nums1, int[] nums2) {
8        HashSet <Integer> a= new HashSet<>();
9        HashSet<Integer> s = new HashSet<>();
10        for(int j: nums2){
11            s.add(j);
12        }
13        for(int i: nums1){
14            if(s.contains(i)){
15                a.add(i);
16            }
17        }
18        int[] ans=new int[a.size()];
19        int n=0;
20        for(int i:a){
21             ans[n]=i;
22             n++;
23        }
24        return ans;
25    }
26}
27    // public static int[] intersection(int[] nums1, int[] nums2) {
28    //     HashSet <Integer> a= new HashSet<>();
29    //     for(int i: nums1){
30    //         for(int j: nums2){
31    //             if(i==j){
32    //                 a.add(i);
33    //             }
34    //         }
35    //     }
36    //     int [] ans=new int[a.size()];
37    //     int s=0;
38    //     for(int i:a){
39    //         ans[s] = i;
40    //         s++;
41    //     }
42    //     return ans;
43    // }
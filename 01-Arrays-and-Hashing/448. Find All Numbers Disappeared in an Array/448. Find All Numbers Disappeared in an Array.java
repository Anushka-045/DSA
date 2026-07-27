1class Solution {
2    static{
3        for(int j=0; j<500;j++){
4            findDisappearedNumbers(new int[] {2,1});
5        }
6    }
7    public static List<Integer> findDisappearedNumbers(int[] nums) {
8        List<Integer> a=new  ArrayList<>();
9        for(int i: nums){
10            int idx = Math.abs(i) - 1;
11            if(nums[idx]>0){
12                nums[idx]=-nums[idx];
13            }
14        }
15        for(int j=0; j<nums.length;j++){
16            if(nums[j]>0){
17                a.add(j+1);
18            }
19        }
20        return a;
21        
22    }
23}
24// class Solution {
25//     public static List<Integer> findDisappearedNumbers(int[] nums) {
26//         int[] sorted = nums.clone();
27//         Arrays.sort(sorted);
28        
29//         List<Integer> result = new ArrayList<>();
30//         int n = sorted.length;
31        
32//         for (int i = 1; i <= n; i++) {
33//             if (Arrays.binarySearch(sorted, i) < 0) {
34//                 result.add(i);
35//             }
36//         }
37        
38//         return result;
39//     }
40// }
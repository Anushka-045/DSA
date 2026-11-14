1// class Solution {
2//     public int majorityElement(int[] nums) {
3//         HashMap<Integer,Integer> f=new HashMap<>();
4//         for(int i=0;i<nums.length;i++){
5//             f.put(nums[i], f.getOrDefault(nums[i], 0) + 1);
6//         }
7//         for(Map.Entry<Integer,Integer> m : f.entrySet()){
8//             if(m.getValue()>nums.length/2){
9//                 return m.getKey();
10//             }
11//         }
12//         return 0;
13
14        
15//     }
16// }
17class Solution {
18    public int majorityElement(int[] nums) {
19        int count = 0 , element = 0;
20        for(int num : nums){
21            if(count ==0){
22                element = num;
23                count = 1;
24
25            }else if(num == element){
26                count++;
27            }else{
28                count--;
29            }
30        }
31        return element;
32
33    }
34}
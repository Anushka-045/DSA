class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];
        System.arraycopy(nums, 0, ans, 0, n);
        System.arraycopy(nums, 0, ans, n, n);
        return ans;
    }
}
// class Solution {
//     public int[] getConcatenation(int[] nums) {
//         int n= nums.length;
//         int[] ans= new int[2*n];
//         for(int i=0 ; i < n ; i++){
//             ans[i] = nums[i]; 
//             ans[i + n] = nums[i];
//         }
//         return ans;
        
//     }
// }
// import java.util.ArrayList;
// import java.util.Arrays;
// class Solution {
//     public int[] getConcatenation(int[] nums) {
//         ArrayList<Integer> list = new ArrayList<>();
//         for(int i = 0; i < nums.length; i++) {
//             list.add(nums[i]);
//         }
//         ArrayList<Integer> l=new ArrayList<>();
//         l.addAll(list);
//         l.addAll(list);
//         int[] ans = new int[l.size()];
//         for (int i = 0; i < l.size(); i++) {
//             ans[i] = l.get(i);
//         }
//         return ans;
//     }
// }

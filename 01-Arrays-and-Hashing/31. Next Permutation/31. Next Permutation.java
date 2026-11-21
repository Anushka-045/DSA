1class Solution {
2    public void nextPermutation(int[] nums) {
3        int n=nums.length;
4        int bp=-1;
5        for(int i=n-2;i>=0;i--){
6            if(nums[i]<nums[i+1]){
7                bp=i;
8                break;
9            }
10        }
11        if(bp != -1) {
12            for(int i = n-1; i > bp; i--) {
13                if(nums[i] > nums[bp]) {
14                    int temp = nums[i];
15                    nums[i] = nums[bp];
16                    nums[bp] = temp;
17                    break;
18                }
19            }
20        }
21        int left = bp + 1;
22        int right = n-1;
23
24        while(left < right) {
25            int temp = nums[left];
26            nums[left] = nums[right];
27            nums[right] = temp;
28
29            left++;
30            right--;
31        }
32    }
33}
34        
35// First, find the breaking point (the first element from right that is not in descending order).
36// Then, find the last element greater than the breaking point and swap them.
37// Finally, reverse all the elements after the breaking point.
38
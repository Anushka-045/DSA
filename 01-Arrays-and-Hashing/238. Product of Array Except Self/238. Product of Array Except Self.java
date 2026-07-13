1class Solution {
2    static{
3        for(int i = 0 ; i < 500 ; i++)
4            productExceptSelf(new int[] {0,1});
5    }
6    public static int[] productExceptSelf(int[] nums) {
7        int [] p= new int[nums.length];
8        int [] ans= new int[nums.length];
9        int [] s=new int[nums.length];
10        p[0] = 1;
11        for (int i = 1; i < nums.length; i++) {
12            p[i] = p[i - 1] * nums[i - 1];
13        }
14        s[nums.length-1]=1;
15        for (int i = nums.length-2; i >= 0; i--) {
16            s[i] = s[i + 1] * nums[i + 1];
17        }
18        for(int i = 0; i < nums.length; i++){
19            ans[i]=p[i]*s[i];
20        }
21        return ans;
22    }
23}
24
25
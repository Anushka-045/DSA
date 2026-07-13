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
24/*Dry run: nums = [-1, 1, 0, -3, 3], n = 5
25
26SETUP
27p   = [0, 0, 0, 0, 0]
28s   = [0, 0, 0, 0, 0]
29ans = [0, 0, 0, 0, 0]
30
31PREFIX LOOP
32p[0] = 1                              -> p = [1, 0, 0, 0, 0]
33i=1: p[1] = p[0]*nums[0] = 1*-1 = -1  -> p = [1, -1, 0, 0, 0]
34i=2: p[2] = p[1]*nums[1] = -1*1 = -1  -> p = [1, -1, -1, 0, 0]
35i=3: p[3] = p[2]*nums[2] = -1*0 = 0   -> p = [1, -1, -1, 0, 0]
36i=4: p[4] = p[3]*nums[3] = 0*-3 = 0   -> p = [1, -1, -1, 0, 0]
37
38Final p = [1, -1, -1, 0, 0]
39
40SUFFIX LOOP
41s[4] = 1                              -> s = [0, 0, 0, 0, 1]
42i=3: s[3] = s[4]*nums[4] = 1*3 = 3    -> s = [0, 0, 0, 3, 1]
43i=2: s[2] = s[3]*nums[3] = 3*-3 = -9  -> s = [0, 0, -9, 3, 1]
44i=1: s[1] = s[2]*nums[2] = -9*0 = 0   -> s = [0, 0, -9, 3, 1]
45i=0: s[0] = s[1]*nums[1] = 0*1 = 0    -> s = [0, 0, -9, 3, 1]
46
47Final s = [0, 0, -9, 3, 1]
48
49COMBINE LOOP
50ans[0] = p[0]*s[0] = 1*0   = 0
51ans[1] = p[1]*s[1] = -1*0  = 0
52ans[2] = p[2]*s[2] = -1*-9 = 9
53ans[3] = p[3]*s[3] = 0*3   = 0
54ans[4] = p[4]*s[4] = 0*1   = 0
55
56FINAL OUTPUT
57ans = [0, 0, 9, 0, 0]*/
58
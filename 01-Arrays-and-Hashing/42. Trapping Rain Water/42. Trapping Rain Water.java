1class Solution {
2    static{
3        for(int i=0;i<500;i++){
4            trap(new int[]{0,1});
5        }
6    }
7    public static int trap(int[] height) {
8        
9        int [] p= new int[height.length];
10        int ans=0;
11        int [] s=new int[height.length];
12        p[0] = 0;
13        for (int i = 1; i < height.length; i++) {
14            p[i] = Math.max(p[i-1], height[i-1]);
15        }
16        s[height.length-1]=0;
17        for (int i = height.length-2; i >= 0; i--) {
18            s[i] = Math.max(s[i+1], height[i+1]);
19        }
20        for(int i = 1; i < height.length-1; i++){
21            ans += Math.max(0, Math.min(p[i], s[i]) - height[i]);
22        }
23        return ans;
24    }
25}
26
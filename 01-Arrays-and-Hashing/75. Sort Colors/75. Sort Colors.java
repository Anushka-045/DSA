1class Solution {
2    public void sortColors(int[] nums) {
3        int o=0,z=0,t=0;
4        for(int i:nums){
5            if(i==0){
6                z++;
7            }
8            else if(i==1){
9                o++;
10            }
11            else if(i==2){
12                t++;
13            }
14        }
15        for(int i=0;i<z;i++){
16            nums[i]=0;
17        }
18        for(int i=z;i<z+o;i++){
19            nums[i]=1;
20        }
21        for(int i=o+z;i<z+o+t;i++){
22            nums[i]=2;
23        }
24    }
25}
1class Solution {
2    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
3        int n=nums1.length+nums2.length;
4        int[] arr= new int[n];
5        for(int i=0;i<nums1.length;i++){
6            arr[i]=nums1[i];
7
8        }
9       for(int i=nums1.length;i<n;i++){
10            arr[i]=nums2[i-nums1.length];
11
12        }
13        Arrays.sort(arr);
14        if(n%2!=0){
15            return arr[n/2];
16        }
17        return (arr[n/2 - 1] + arr[n/2]) / 2.0;
18    }
19}
1// class Solution {
2//     public String reverseStr(String s, int k) {
3//         char[] arr = s.toCharArray();
4//         for (int i = 0; i < arr.length; i += 2 * k) {
5//             int end = Math.min(i + k, arr.length);
6//             String chunk = new String(arr, i, end - i);
7//             String reversedChunk = new StringBuilder(chunk).reverse().toString();
8//             for (int j = 0; j < reversedChunk.length(); j++) {
9//                 arr[i + j] = reversedChunk.charAt(j);
10//             }
11//         }
12//         return new String(arr);
13//     }
14// }
15class Solution {
16    public String reverseStr(String s, int k) {
17        char[] arr = s.toCharArray();
18        int n = arr.length;
19        for(int i=0;i<n;i+=2*k){
20            if(i+k-1>=n) reverse(arr,i,n-1);
21            else reverse(arr,i,i+k-1);
22        }
23        return new String(arr);
24    }
25    public void reverse(char[] arr, int start, int end){
26        while(start<end){
27            char temp = arr[start];
28            arr[start]=arr[end];
29            arr[end]=temp;
30            start++;
31            end--;
32        }
33    }
34}
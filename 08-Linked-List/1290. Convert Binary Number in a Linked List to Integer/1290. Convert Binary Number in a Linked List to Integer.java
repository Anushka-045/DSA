1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11// class Solution {
12//     public int getDecimalValue(ListNode head) {
13//         int ans = 0;
14//         ListNode curr = head;
15//         while (curr != null) {
16//             ans = ans * 2 + curr.val;
17//             curr = curr.next;
18//         }
19//         return ans;
20//     }
21// }
22class Solution {
23    public int getDecimalValue(ListNode head) {
24        int len = 0;
25        ListNode curr = head;
26        while (curr != null) {
27            len++;
28            curr = curr.next;
29        }
30        curr = head;
31        int ans = 0;
32        for (int i = len - 1; i >= 0; i--) {
33            ans += curr.val * Math.pow(2, i);
34            curr = curr.next;
35        }
36        return ans;
37    }
38}
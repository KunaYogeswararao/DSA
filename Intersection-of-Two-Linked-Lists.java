1public class Solution {
2    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
3        
4        ListNode pA = headA;
5        ListNode pB = headB;
6        
7        while(pA != pB)
8        {
9            if(pA == null)
10                pA = headB;
11            else
12                pA = pA.next;
13            
14            if(pB == null)
15                pB = headA;
16            else
17                pB = pB.next;
18        }
19        
20        return pA;
21    }
22}
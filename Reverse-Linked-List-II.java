1class Solution {
2    public ListNode reverseBetween(ListNode head, int left, int right) {
3        ListNode curr = head;
4        ListNode prev = null;
5        int pos = 1;
6
7        if(left == right) return head;
8
9        // move to the left position
10        while(pos < left){
11            prev = curr;
12            curr = curr.next;
13            pos++;
14        }
15
16        ListNode connection = prev;
17        ListNode tail = curr;
18
19        // reverse from left to right
20        while(pos <= right){
21            ListNode nextNode = curr.next;
22            curr.next = prev;
23            prev = curr;
24            curr = nextNode;
25            pos++;
26        }
27
28        if(connection != null)
29            connection.next = prev;
30        else
31            head = prev;
32
33        tail.next = curr;
34
35        return head;
36    }
37}
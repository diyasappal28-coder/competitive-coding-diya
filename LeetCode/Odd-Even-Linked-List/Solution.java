1
2class Solution {
3    public ListNode oddEvenList(ListNode head) {
4       
5       
6        if (head == null || head.next == null) {
7            return head;
8        }
9
10      
11        ListNode evenHead = head.next;
12
13        ListNode odd = head;
14        ListNode even = head.next;
15
16        while (even != null && even.next != null) {
17
18            
19            odd.next = even.next;
20            odd = odd.next;
21
22           
23            even.next = odd.next;
24            even = even.next;
25        }
26
27        
28        odd.next = evenHead;
29
30        return head;
31    }
32}
33    
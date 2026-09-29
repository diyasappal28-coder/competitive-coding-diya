1
2class Solution {
3    public boolean isPalindrome(ListNode head) {
4        
5       
6
7        ListNode slow = head;
8        ListNode fast = head;
9
10        while (fast != null && fast.next != null) {
11            slow = slow.next;
12            fast = fast.next.next;
13        }
14
15        ListNode secondHalf = reverse(slow);
16
17        ListNode firstHalf = head;
18
19        while (secondHalf != null) {
20
21            if (firstHalf.val != secondHalf.val) {
22                return false;
23            }
24
25            firstHalf = firstHalf.next;
26            secondHalf = secondHalf.next;
27        }
28
29        
30        return true;
31    }
32
33    private ListNode reverse(ListNode head) {
34
35        ListNode previous = null;
36        ListNode current = head;
37
38        while (current != null) {
39
40            ListNode nextNode = current.next;
41
42            current.next = previous;
43
44            previous = current;
45            current = nextNode;
46        }
47
48        return previous;
49    }
50}
51    
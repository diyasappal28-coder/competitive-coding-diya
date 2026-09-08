1class MyQueue {
2Stack<Integer> stack1;
3    Stack<Integer> stack2;
4
5    public MyQueue() {
6        stack1 = new Stack<>();
7        stack2 = new Stack<>();
8
9        
10    }
11    
12    public void push(int x) {
13         stack1.push(x);
14    }
15    
16    public int pop() {
17        if (stack2.isEmpty()) {
18            while (!stack1.isEmpty()) {
19                stack2.push(stack1.pop());
20            }
21        }
22
23        return stack2.pop();
24
25    }
26    
27    public int peek() {
28                if (stack2.isEmpty()) {
29            while (!stack1.isEmpty()) {
30                stack2.push(stack1.pop());
31            }
32        }
33
34        return stack2.peek();
35
36    }
37    
38    public boolean empty() {
39                return stack1.isEmpty() && stack2.isEmpty();
40
41    }
42}
43
44/**
45 * Your MyQueue object will be instantiated and called as such:
46 * MyQueue obj = new MyQueue();
47 * obj.push(x);
48 * int param_2 = obj.pop();
49 * int param_3 = obj.peek();
50 * boolean param_4 = obj.empty();
51 */
1class Solution {
2    public int largestRectangleArea(int[] heights) {
3        
4
5
6
7        Stack<Integer> stack = new Stack<>();
8        int maxArea = 0;
9
10        for (int i = 0; i <= heights.length; i++) {
11
12            int currentHeight;
13
14            if (i == heights.length) {
15                currentHeight = 0;
16            } else {
17                currentHeight = heights[i];
18            }
19
20            while (!stack.isEmpty() &&
21                   currentHeight < heights[stack.peek()]) {
22
23                int height = heights[stack.pop()];
24
25                int width;
26
27                if (stack.isEmpty()) {
28                    width = i;
29                } else {
30                    width = i - stack.peek() - 1;
31                }
32
33                int area = height * width;
34
35                maxArea = Math.max(maxArea, area);
36            }
37
38            stack.push(i);
39        }
40
41        return maxArea;
42    }
43}
44    
45
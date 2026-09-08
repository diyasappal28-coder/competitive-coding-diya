1class Solution {
2    public int search(int[] nums, int target) {
3        
4
5        int left = 0;
6        int right = nums.length - 1;
7
8        while (left <= right) {
9
10            int mid = left + (right - left) / 2;
11
12         
13            if (nums[mid] == target) {
14                return mid;
15            }
16
17            
18            if (nums[left] <= nums[mid]) {
19
20
21                if (nums[left] <= target && target < nums[mid]) {
22                    right = mid - 1;
23                }
24
25                else {
26                    left = mid + 1;
27                }
28            }
29
30            
31            else {
32
33              
34                if (nums[mid] < target && target <= nums[right]) {
35                    left = mid + 1;
36                }
37
38             
39                else {
40                    right = mid - 1;
41                }
42            }
43        }
44
45        return -1;
46    }
47}
48    
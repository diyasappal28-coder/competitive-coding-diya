1class Solution {
2    public int addDigits(int num) {
3        
4        while (num >= 10) {
5            int sum = 0;
6
7            while (num > 0) {
8                sum = sum + num % 10;
9                num = num / 10;
10            }
11
12            num = sum;
13        }
14
15        return num;
16    }
17}
18    
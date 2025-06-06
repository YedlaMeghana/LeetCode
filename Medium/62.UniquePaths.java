/* 62. Unique Paths
There is a robot on an m x n grid. The robot is initially located at the top-left corner (i.e., grid[0][0]). The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]). The robot can only move either down or right at any point in time.
Given the two integers m and n, return the number of possible unique paths that the robot can take to reach the bottom-right corner.
The test cases are generated so that the answer will be less than or equal to 2 * 109. */

class Solution {
    public int uniquePaths(int m, int n) {
        int N = m+n-2;
        int r = n-1;
        double res = 1 , rem = 1;
        for(int i=1;i<=r;i++){
            res = res * (N-r+i)/i;
        }
        return (int)res;
    }
}

/* 
Input
m = 13
n = 23
Output
548354040
*/ 

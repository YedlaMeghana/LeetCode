/* 50. Pow(x, n)
Implement pow(x, n), which calculates x raised to the power n (i.e., xn).

Example :
Input: x = 2.00000, n = 10
Output: 1024.00000*/

class Solution {
    public double myPow(double x, int n) {
        long n2 = n;
        double val = 1.0;
        if(n2 < 0){
            n2 = n2 * (-1);
        }
        while(n2 > 0){
            if(n2 % 2 == 0){
                x = x * x;
                n2 = n2/2;
            }else{
                val = val * x;
                n2 = n2 - 1;
            }
        }
        if(n < 0)
          val = (double) 1 /val;

        return val;
    }
}

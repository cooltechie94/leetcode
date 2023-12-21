package org.example;

/*
69. Sqrt(x)
Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.

You must not use any built-in exponent function or operator.

For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.


Example 1:

Input: x = 4
Output: 2
Explanation: The square root of 4 is 2, so we return 2.
Example 2:

Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.


Constraints:

0 <= x <= 231 - 1


*/
public class sqrt_69 {
    public int mySqrt(int x) {
        // Square root of 1 and 2 will be 1 and 2 respectively
        if(x<2)
            return x;
        int start = 2;
        int end = x;
        int mid=-1;
        while(start<=end){
            mid = start + (end-start)/2;
            // if square of mid is greater than x, change end to mid-1 value
            if((long)mid*mid > (long)x){
                end = mid-1;
            }
            else if(mid*mid == x)
                return mid;
            else
                start = mid+1; // if square of mid < x, change start to mid+1
        }
        // The loop ends when "start" becomes greater than "end", and "end" is the integer value of the square root.
        // However, since we might have been using integer division in the calculations,
        // we round down the value of "end" to nearest integer to get correct square root.
        return Math.round(end);
    }
}
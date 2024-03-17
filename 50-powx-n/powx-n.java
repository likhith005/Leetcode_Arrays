class Solution {
    double solve(double x, long n) {
        if (n == 0) return 1; // Base case: x^0 = 1
        
        // If n is negative, take the reciprocal of x and make n positive
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }

        // If n is even, recursively compute the square of x^(n/2)
        if (n % 2 == 0) {
            return solve(x * x, n / 2);
        } 
        
        // If n is odd, recursively compute x^(n-1) and multiply it by x
        else {
            return x * solve(x * x, (n - 1)/2);
        }
    }
    
    public double myPow(double x, int n) {
        return solve(x, n);
    }
}

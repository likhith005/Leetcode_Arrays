class Solution {
    public double myPow(double x, int n) {
        // if(n==0) return 1;

        // int N = n;
        // if(N<0){
        //     N = -N;
        //     x = 1/x;
        // }

        // if(N % 2 == 0){
        //     return myPow(x * x, (int)(N/2));
        // }
        // else{
        //     return x * myPow(x, (int)(N-1));
        // }

        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        return power(x, N);
    }
    
    private double power(double x, long n) {
        if (n == 0) return 1;
        double result = power(x * x, n / 2);
        return (n % 2 == 0) ? result : result * x;
        
    }
}
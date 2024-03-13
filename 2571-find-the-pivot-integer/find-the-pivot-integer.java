class Solution {
    public int pivotInteger(int n) {
        if(n==1){
            return 1;
        }
        int totalSum = n*(n+1)/2;
        int left=1,right=n;
        while(left<=right){
            int midpoint = left + (right-left)/2;
            if(midpoint*midpoint==totalSum){
                return midpoint;
            }else if(midpoint*midpoint<totalSum){
                left=midpoint+1;
            }else{
                right=midpoint-1;
            }
        }
        return -1;
    }
}
class Solution {
    public int missingNumber(int[] nums) {
        // Arrays.sort(nums);
        // int n = nums.length;
        // for (int i = 0; i < n; i++) {
        //     if (nums[i] != i) {
        //         return i;
        //     }
        // }
        // return n;
        
        // int n = nums.length;
        // int sum=n*(n+1)/2;
        // for(int i=0;i<n;i++){
        //     sum -= nums[i];
        // }
        // return sum;

        int n = nums.length;
        int result = n;
        for(int i=0;i<n;i++){
            result ^= i;
            result ^= nums[i];
        }
        return result;
    }
}
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


        // int n = nums.length;
        // int result = n;
        // for(int i=0;i<n;i++){
        //     result ^= i;
        //     result ^= nums[i];
        // }
        // return result;


        int n = nums.length;
        Arrays.sort(nums);
        int l = 0;
        int r = n - 1;
        int result = n;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] > mid) {
                result = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return result;
    }
}
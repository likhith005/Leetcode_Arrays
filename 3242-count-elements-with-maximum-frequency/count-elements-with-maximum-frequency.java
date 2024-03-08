class Solution {
    public int maxFrequencyElements(int[] nums) {
        //Returning the maximum element in an array

        // Arrays.sort(nums);
        // int n = nums.length;
        // return nums[n-1];


        // int ans=0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]>ans){
        //         ans=nums[i];
        //     }
        // }
        // return ans;

        //but need to return maximum frequency or duplicate of element in an array

        int[] arr = new int[101];
        int maxfreq = 0;
        for(int num:nums){
            arr[num]++;
            maxfreq=Math.max(maxfreq,arr[num]);
        }

        int result = 0;
        for(int i=0;i<101;i++){
            if(arr[i]==maxfreq){
                result+=maxfreq;
            }
        }
        return result;
    }
}
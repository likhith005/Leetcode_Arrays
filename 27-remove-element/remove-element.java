class Solution {
    public int removeElement(int[] nums, int val) {
        // int count=0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]!=val){
        //         nums[count]=nums[i];
        //         count++;
        //     }
        // }
        // return count;

        int i=0,j=0;
        while(j<nums.length){
            if(nums[j]!=val){
                nums[i]=nums[j];
                i++;
            }
            j++;
        }
        return i;
    }
}
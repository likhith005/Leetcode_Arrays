class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
        }
        int cs=0;
        for(int i=0;i<nums.length;i++){
            int ls = cs;
            int rs = sum-cs-nums[i];
            if(ls == rs){
                return i;
            }
            cs += nums[i];
        }
        return -1;
    }
}
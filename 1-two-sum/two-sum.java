class Solution {
    public int[] twoSum(int[] nums, int target) {
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]+nums[j]==target){
        //             return new int[] {i,j};
        //         }
        //     }
        // }
        // return nums;


        // Map<Integer,Integer> nums_map = new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     int complement = target - nums[i];
        //     if(nums_map.containsKey(complement)){
        //         return new int[] {nums_map.get(complement),i};
        //     }
        //     nums_map.put(nums[i],i);
        // }
        // return null;

        Map<Integer,Integer> complement = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if (complement.containsKey(nums[i])){
                return new int[] {complement.get(nums[i]), i};
            }
            complement.put(target-nums[i],i);
        }
        return null;
    }
}
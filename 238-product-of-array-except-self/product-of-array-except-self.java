class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 0;
        int productWithoutZero=1;
        for(int i : nums){
            if(i==0){
                product++;
            }else{
                productWithoutZero *= i;
            }
        }
        int[] result = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                if(product>0){
                    result[i]=0;
                }else{
                    result[i]=productWithoutZero/nums[i];
                }
            }else{
                if(product>1){
                    result[i]=0;
                }else{
                    result[i]=productWithoutZero;
                }
            }
        }
        return result;
    }
}
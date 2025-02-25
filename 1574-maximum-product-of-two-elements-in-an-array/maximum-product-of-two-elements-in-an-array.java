class Solution {
    public int maxProduct(int[] nums) {
        int one = 0;
        int two = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] > one){
                two = one;
                one = nums[i];
            }
            else
                two = Math.max(two, nums[i]);
        }
        return (one-1) * (two-1);    
    }
}
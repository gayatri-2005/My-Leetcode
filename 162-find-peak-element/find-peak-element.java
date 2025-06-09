class Solution {
    public int findPeakElement(int[] nums) {
        int e = nums.length-1;
        int s =0;
        while(s<e){
            int m = (s+e)/2;
            if(nums[m]>nums[m+1]){
                e = m;
            }
            else{
                s= m+1;
            }
        }
        return s;
    }
}
class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length,num=0;
        for(int i =0;i<32;i++){
            int c =0;
            for(int j =0;j<n;j++){
                if(((nums[j]>>i)&1)==1){
                    c++;
                }
            }
            if(c%3 !=0){
             num = num|1<<i;
            }
        }
        return num;
    }
}
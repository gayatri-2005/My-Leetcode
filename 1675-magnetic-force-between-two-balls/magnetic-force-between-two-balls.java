class Solution {
    public boolean pri(int[] nums,int m,int value){
        int el = nums[0];
        m--;
        for(int i=1;i<nums.length;i++){
            if(nums[i]-el>=value){
                m--;
                el = nums[i];
            }
            if(m<=0) return true;
        }
        return false;
        
    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int l = 1;
        int r = (int)Math.pow(10,9);
        while(l<=r){
            int mid = l+(r-l)/2;
            if(pri(position,m,mid)==false){
                r = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return r;
    }
}
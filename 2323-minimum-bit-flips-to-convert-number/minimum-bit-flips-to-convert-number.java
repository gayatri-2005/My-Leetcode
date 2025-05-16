class Solution {
    public int minBitFlips(int start, int goal) {
        int ans = start ^ goal;
          int c =0;
        for(int i =0;i<32;i++){
         if(((ans>>i)&1)==1){
            c++;
         }
        }
        return c;
    }
}
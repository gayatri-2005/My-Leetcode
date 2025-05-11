class Solution {
    public void nextPermutation(int[] arr) {
        int n = arr.length;
        int d = -1;

        for(int i= n-1;i>0;i--){
            if(arr[i]>arr[i-1]){
                d=i-1;
                break;          
         }
        }
        if(d!=-1){
        for(int i = n-1;i>d;i--){
            if(arr[i]>arr[d]){
                int temp = arr[d];
                arr[d] = arr[i];
                arr[i] = temp;
                break;
            }
        }
        }

        int l = d+1;
        int r = n-1;
        while(l<r){
         int temp = arr[l];
         arr[l] = arr[r];
         arr[r] = temp;
         l++;
         r--;
        }
    }
}
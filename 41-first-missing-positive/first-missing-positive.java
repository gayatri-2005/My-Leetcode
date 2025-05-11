class Solution {
    public int firstMissingPositive(int[] arr) {
        int n = arr.length;
        for(int i =0;i<n;i++){
            while(arr[i]!=i+1){
                int ele = arr[i];
                int index = ele-1;
                if(index<0 || index>=n){
                    break;
                }
             if(arr[i]==arr[index]){
                break;
             }   
                int temp = arr[i];
                arr[i]= arr[index];
                arr[index] = temp;
            }
        }
        for(int i =0;i<n;i++){
            if(arr[i]!=i+1){
                return i+1;
            }
        }
        return n+1;
    }
}
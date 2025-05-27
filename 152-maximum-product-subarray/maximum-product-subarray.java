class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int maxProduct = Integer.MIN_VALUE;
        int prod = 1;
        for (int i = 0; i < n; i++) {
            prod *= nums[i];
            maxProduct = Math.max(maxProduct, prod);
            if (prod == 0) prod = 1;
        }
        prod = 1;
        for (int i = n - 1; i >= 0; i--) {
            prod *= nums[i];
            maxProduct = Math.max(maxProduct, prod);
            if (prod == 0) prod = 1;
        }

        return maxProduct;
    }
}

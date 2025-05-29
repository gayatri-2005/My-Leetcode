class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int s = 0, e = 0, sum = 0;
        int ans = Integer.MAX_VALUE;
        while (e < n) {
            sum += nums[e];
            while (sum >= target) {
                ans = Math.min(ans, e - s + 1);
                sum -= nums[s];
                s++;
            }
            e++;
        }
        return (ans == Integer.MAX_VALUE) ? 0 : ans;
    }
}

import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0, j = 0;
        int maxLen = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        while (j < s.length()) {
            char c = s.charAt(j);
            map.put(c, map.getOrDefault(c, 0) + 1);
            while (map.get(c) > 1) {
                char leftChar = s.charAt(i);
                map.put(leftChar, map.get(leftChar) - 1);
                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                i++; 
            }
            maxLen = Math.max(maxLen, j - i + 1);
            j++; 
        }

        return maxLen;
    }
}

package string;

import java.util.HashMap;
import java.util.Map;

/**
 * 无重复字符的最长子串
 */
public class LengthOfLongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        int sLen = s.length(), matchLen = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0, j = 0; j < sLen; j++) {
            //如果存在重复字符，将窗口滑到重复字符的地方
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            matchLen = Math.max(matchLen, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return matchLen;
    }

    public int lengthOfLongestSubstring2(String s) {
        int length = s.length();
        if (length < 1) return 0;
        int maxLen = 1;
        for (int head = 0, tail = 1; tail < s.length(); tail++) {
            char c = s.charAt(tail);
            int index = s.indexOf(c, head);
            if (index < tail) {
                head += (index - head + 1);
            }
            int len = tail - head + 1;
            maxLen = len > maxLen ? len : maxLen;
        }
        return maxLen;
    }

    public static void main(String[] args) {

    }

}

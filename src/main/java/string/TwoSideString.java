package string;

public class TwoSideString {


    public static boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^0-9a-z]", "");
        char[] c = s.toCharArray();
        int i = 0, j = c.length - 1;
        while (i < j) {
            if (c[i] != c[j]) return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        boolean isPalindrome = isPalindrome("A man, a plan, a canal: Panama");
    }
}

package string;

public class ReverseString {

    public static char[] reverse(char[] input) {

        int i = 0;
        int j = input.length - 1;

        while (i < j) {
            char tmp = input[j];
            input[j] = input[i];
            input[i] = tmp;
            i++;
            j--;
        }

        return input;
    }

    public static void main(String[] args) {
        char[] input = new char[]{'h', 'e', 'l', 'o', 'o'};
        input = reverse(input);
        System.out.println(input);
    }

}

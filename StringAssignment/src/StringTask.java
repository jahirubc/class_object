public class StringTask {
    public static void main(String[] args) {
        String S = "Java String Exercises";
        String result = replaceSpaceandUnderscores(S);
        System.out.println(result);
        String reverse = stringReverse(S);
        System.out.println(reverse);
        boolean isPalindrome = checkPalindrome(S);
        System.out.println(isPalindrome);
    }
    public static String replaceSpaceandUnderscores(String S) {
        return S.replace(" ", "_");
    }
    public static void countConsonantAndVowel(String S){
        int v = 0;
        int c = 0;
        S = S.toLowerCase();



    }

    public static String stringReverse(String S){
        String reversedString = new StringBuilder(S).reverse().toString();
        return reversedString;
    }

    private static boolean checkPalindrome(String input) {
        String reversed = stringReverse(input);
        return input.equals(reversed);
    }


}


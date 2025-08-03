public class Main {
    public static boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return false;
        }
        int start = 0;
        int end = s.length() - 1;
        while (start <= end) {
            char first = s.charAt(start);
            char last = s.charAt(end);
            if (!Character.isLetterOrDigit(first)) {
                start++;
            } else if (!Character.isLetterOrDigit(last)) {
                end--;
            } else {
                if (Character.toLowerCase(first) != Character.toLowerCase(last)) {
                    return false;
                } else {
                    start++;
                    end--;
                }
            }
        }
        return true;
    }

    public static void main(String args[]) {
        String a = "A man, a plan, a canal: Panama";
        boolean ans = isPalindrome(a);
        System.out.println(ans);
    }
}
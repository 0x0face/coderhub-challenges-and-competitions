public class Q003 {

  public static void main(String[] args) {
    System.out.println(isPalindrome("racecar"));
    System.out.println(shortestPalindrome("programming"));
  }

  public static String shortestPalindrome(String word) {
    // return the smallest string that contains the paramter passed to the function
    if (isPalindrome(word)) return word;

    String strToReturn = null;
    for (int i = word.length() - 1; i > 0; i--) {
      strToReturn = reverseString(word.substring(i)) + word;
      if (isPalindrome(strToReturn)) return strToReturn;
    }
    return null;
  }

  // not provided with the question
  private static boolean isPalindrome(String str) {
    int l = str.length();
    for (int i = 0; i < l; i++) {
      if (str.charAt(i) != str.charAt(l - i - 1)) return false;
    }
    return true;
  }

  private static String reverseString(String str) {
    char temp = '0';
    char[] chars = str.toCharArray();
    int l = chars.length;
    for (int i = 0; i < l / 2; i++) {
      temp = chars[i];
      chars[i] = chars[l - i - 1];
      chars[l - i - 1] = temp;
    }
    return new String(chars);
  }
}

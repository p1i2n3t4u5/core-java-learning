package com.test.pallendrom;

public class Pallendrom {

  public static void main(String[] args) {

    System.out.println(isPalindrome("aba"));
    System.out.println(isPalindrome("abba"));
    System.out.println(isPalindromeReverseTheString2("abaa"));
    System.out.println(isPalindromeReverseTheString3("abaa"));

  }

  public static boolean isPalindrome(String text) {
    String clean = text.replaceAll("\\s+", "").toLowerCase();
    int length = clean.length();
    int forward = 0;
    int backward = length - 1;
    while (backward > forward) {
      char forwardChar = clean.charAt(forward++);
      char backwardChar = clean.charAt(backward--);
      if (forwardChar != backwardChar)
        return false;
    }
    return true;
  }

  public boolean isPalindromeReverseTheString(String text) {
    StringBuilder reverse = new StringBuilder();
    String clean = text.replaceAll("\\s+", "").toLowerCase();
    char[] plain = clean.toCharArray();
    for (int i = plain.length - 1; i >= 0; i--) {
      reverse.append(plain[i]);
    }
    return (reverse.toString()).equals(clean);
  }
  
  public static boolean isPalindromeReverseTheString2(String text) {
    StringBuilder original = new StringBuilder(text);
    System.out.println(original);
    StringBuilder reverse = original.reverse();
    System.out.println(reverse);
    return (reverse.toString()).equals(original.toString());
  }
  
  public static boolean isPalindromeReverseTheString3(String text) {
    StringBuffer original = new StringBuffer(text);
    System.out.println(original);
    StringBuffer reverse = original.reverse();
    System.out.println(reverse);
    return (reverse.toString()).equals(original.toString());
  }


}

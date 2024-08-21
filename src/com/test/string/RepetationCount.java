package com.test.string;

public class RepetationCount {

  public static void main(String[] args) {

    String s = "aaaAbbbBcc";

    // count lowecase alphabets succeeding capital letters

    char[] charArray = s.toCharArray();
    int counter = 1;
    int finalCounter = 0;
    for (int i = 0; i < charArray.length; i++) {
      if (i != 0 && !Character.isUpperCase(charArray[i])
          && String.valueOf(charArray[i]).equals(String.valueOf(charArray[i - 1]))) {
        continue;
      }

      for (int j = 0; j < charArray.length; j++) {
        if (j > i && !Character.isUpperCase(charArray[i])
            && String.valueOf(charArray[i]).equals(String.valueOf(charArray[j]))) {
          counter++;
        }

        if (!String.valueOf(charArray[i]).equals(String.valueOf(charArray[j])) && Character.isUpperCase(charArray[j])
            && String.valueOf(charArray[i]).equalsIgnoreCase(String.valueOf(charArray[j]))) {
          finalCounter = finalCounter + counter;
          counter = 1;
        }
      }
    }

    System.out.println(finalCounter);

  }

}

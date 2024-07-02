package basicProgram;

import java.util.Arrays;

public class AnagramSample  {

   // two element in same length and present the same char's.

   public static void main(String args[]) {
      String str1 = "recitals";
      String str2 = "articles";

      if (str1.length()==str2.length()) {
         char[] arr1 = str1.toCharArray();
         Arrays.sort(arr1);

         char[] arr2 = str2.toCharArray();
         Arrays.sort(arr2);

         if(Arrays.equals(arr1, arr2)) {
            System.out.println("Given strings are anagrams");
         } else {
            System.out.println("Given strings are not anagrams");
         }
      }
   }
}
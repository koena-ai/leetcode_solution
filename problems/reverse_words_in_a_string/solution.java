import java.util.*;
class Solution {
    public static  String reverseWords(String s) {
        String word[]= s.trim().split("\\s+");
        Collections.reverse(Arrays.asList(word));
        return String.join(" ",word);
    }
    public static void main(String args[]){
        System.out.println(reverseWords("the sky is blue"));
         System.out.println(reverseWords("hello world"));
    }
}
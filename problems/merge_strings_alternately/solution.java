
class Solution {
    public  static String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int min = Math.min(word1.length(), word2.length());
        for (int i = 0; i < min; i++) {
            result.append(word1.charAt(i)).append(word2.charAt(i));
        }
        if (word1.length() > min) {
           result.append(word1.substring(min));
        }
        if (word2.length() > min) {
            result.append(word2.substring(min));
        }
        return result.toString();
    }
     public static void main(String args[]){
        System.out.println( mergeAlternately("abc","pqr"));
         System.out.println( mergeAlternately("ab","pqrs"));
          System.out.println( mergeAlternately("abcd","pq"));
     }
}
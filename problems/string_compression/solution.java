class Solution {
    public int compress(char[] chars) {
        int index=0;
     // int n= chars.length;
     // int count=1;
      int i=0;
      while(i<chars.length){
        int j= i+1;
         while(  j<chars.length && chars[i]==chars[j]){
            j++;
        }
       int count=j-i;
        chars[index++]=chars[i];
        if(count>=2){
            char [] freq= Integer.toString(count).toCharArray();
            for(char ch:freq){
                chars[index++]=ch;
            }
        }
        i=j;
      }
     return index;

    }
}
class Solution {
    public int missingNumber(int[] nums) {
       int n=nums.length;
       int s1=0;
       for(int i=0;i<n;i++){
        s1=s1+nums[i];

       }
       int s2=0;
       s2=n*(n+1)/2;
       int ans= s2-s1;
       return ans;
    }
}
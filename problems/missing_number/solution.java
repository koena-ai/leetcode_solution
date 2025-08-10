class Solution {
    public int missingNumber(int[] nums) {
        int currentSum=0;
        int range=nums.length;
        int actualSum=(range*(range+1))/2;
        
        
        for(int i=0;i<range;i++){
            currentSum=currentSum+nums[i];
        }
        
        int ans=actualSum - currentSum;
        return ans;


    }
}
class Solution {
    public int[] sortedSquares(int[] nums) {
        int [] ans=new int[nums.length];
        int start=0;
        int end=nums.length-1;
        int ptr=ans.length-1;
        while(start<=end){
            int sp=nums[start]*nums[start];
            int ep=nums[end]*nums[end];
            if(sp>ep){
                ans[ptr]=sp;
                start++;
            }
            else{
                ans[ptr]=ep;
                end--;
            }
            ptr--;
        }
       
        return ans;
       } 
    }

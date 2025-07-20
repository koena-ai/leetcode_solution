class Solution {
    public int tribonacci(int n) {
        if(n==0){
            return 0;

        }
        else if(n==1){
            return 1;
        }
        else if(n==2){
            return 1;
        }
        int t_0=0;
        int t_1=1;
        int t_2=1;
        for(int i=1;i<=n;i++){
            int t_3=t_0+t_1+t_2;
            t_0=t_1;
            t_1=t_2;
            t_2=t_3;
        }
        return t_0;
    }
}
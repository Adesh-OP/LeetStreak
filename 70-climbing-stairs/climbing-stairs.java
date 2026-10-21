class Solution {
    public int climbStairs(int n) {
        if(n<3)
        return n;
        int a=1;
        int b=2;
        int c=0;
        for(int i=1;i<=n-2;i++)
        {
            c=b;
            b=a+b;
            a=c;
        }
        return b;
    }
}
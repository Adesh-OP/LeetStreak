class Solution {
    public boolean isPerfectSquare(int num) {
        int i=1;
        int j=num;
        while(i<=j)
        {
            int mid=i+(j-i)/2;
            if(num/mid==mid && num%mid==0)
            return true;
            else if(mid>num/mid)
            j=mid-1;
            else
            i=mid+1;
        }
        return false;
    }
}
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int i=0,j=arr.length-1;
        while(i<=j)
        {
            int mid=i+(j-i)/2;
            int num=mid+1;
            int missing=arr[mid]-num;
            if(missing>=k)
            j=mid-1;
            else
            i=mid+1;
        }
        return i+k;
    }
}
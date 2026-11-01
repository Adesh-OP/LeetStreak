class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int row=arr.length,column=arr[0].length;
        int i=0;
        int j=row*column-1;
        while(i<=j)
        {
            int mid=(i+j)/2;
           int mrow=mid/column;
           int mcol=mid%column;
           if(arr[mrow][mcol]==target)
           return true;
           else if(arr[mrow][mcol]<target)
           i=mid+1;
           else
           j=mid-1;
        }
        return false;
    }
}
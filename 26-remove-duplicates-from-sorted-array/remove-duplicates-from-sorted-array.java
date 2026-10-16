class Solution {
    public int removeDuplicates(int[] nums) {
        int[] arr=new int[nums.length];
        arr[0]=nums[0];
        int j=1;
        int count=1;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
            continue;
            else
            {
            arr[j]=nums[i+1];
            j++;
            count++;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            nums[i]=arr[i];
        }
        return count;
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        int[] arr=new int[2];
        while(low<high)
        {
            if(nums[low]+nums[high]==target)
            {
                arr[0]=low+1;
                arr[1]=high+1;
                break;
            }
            else if(nums[low]+nums[high]>target)
            high--;
            else
            low++;
        }
        return arr;
    }
}
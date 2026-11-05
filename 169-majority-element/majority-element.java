class Solution {
    public int majorityElement(int[] nums) {
        int count=1;
        int value=0;
        int max=0;
        Arrays.sort(nums);
        if(nums.length==1)
        return nums[0];
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
            count++;
            else 
            count=1;
            if(max<count)
            {
                max=count;
                value=nums[i];
            }
        }
        return value;
    }
}
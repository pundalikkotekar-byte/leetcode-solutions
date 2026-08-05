class Solution {
    public void moveZeroes(int[] nums) {
        int left=0;
        for(int right=0;right<nums.length;right++)
        {

                if(nums[right]!=0)
                {
                    nums[right]=nums[left]-nums[right]+(nums[left]=nums[right]);
                    left++;
                }
        }
    }
}
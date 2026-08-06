class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int s=2*n;
        int[] ans=new int[s];

        for(int i=0;i<n;i++){
            ans[i]=nums[i];
            ans[n+i]=nums[i];
        }
        return ans;
    }
}
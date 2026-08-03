class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] result=new int[n];

        int left=0;
        int right=n-1;

        for(int i=n-1;i>=0;i--){
            int lftsq=nums[left]*nums[left];
            int ritsq=nums[right]*nums[right];

            if(lftsq>ritsq){
                result[i]=lftsq;
                left++;
            }
            else{
                result[i]=ritsq;
                right--;
            }
        }return result;
    }
}
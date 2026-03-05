class Solution {
    public int differenceOfSum(int[] nums) {
        int elementSum =0;
        int digitSum =0;
        int n = nums.length;
        for(int i=0; i<n; i++){
            elementSum += nums[i];
            while(nums[i] > 0){
                digitSum += nums[i] % 10;
                nums[i] = nums[i]/10;
            }
        }
        return Math.abs(elementSum - digitSum);
    }
}
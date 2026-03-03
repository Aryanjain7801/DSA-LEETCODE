class Solution {
    public int[] numberGame(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        Arrays.sort(nums);
        int i =0;
        for (int j=0; j<n; j += 2){
            int alice = nums[i];
            int bob = nums[i+1];
            arr[i++]= bob;
            arr[i++]= alice;
        }
        return arr;
    }
}
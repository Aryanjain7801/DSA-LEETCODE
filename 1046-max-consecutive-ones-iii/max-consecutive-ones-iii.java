class Solution {
    public int longestOnes(int[] nums, int k) {
        
        int i = 0;
        int j = 0;
        int currSum = 0;
        int ans = 0;
        int n = nums.length;
        int Zero = 0 ;
        for(int a = 0 ; a < n ; a++)
        {
            if(nums[a] == 0)
            {
                Zero++ ;
            }
        }
        if(Zero < k) return n ;
        while(j<n)
        {
            currSum += nums[j] ;
            if(j-i+1 - currSum > k)
            {
                currSum -= nums[i] ;
                i++ ;
            }
            else if(j-i+1 - currSum == k)
            {
                ans = Math.max(ans,j-i+1) ;
            }
            j++ ;
        }
        return ans ;
    }
}
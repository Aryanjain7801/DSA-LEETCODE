class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Solve(0,candidates,target, new ArrayList<>(), ans);
        return ans;
    }
    public void Solve (int i , int[] arr, int target, List<Integer> temp, List<List<Integer>> ans){
        if(i== arr.length){
            if (target == 0) ans.add(new ArrayList<>(temp));
            return;
        }
        if(arr[i] <= target){
            temp.add(arr[i]);
            Solve(i, arr, target-arr[i], temp, ans);
            temp.remove(temp.size()-1);
        }
        Solve(i+1,arr,target,temp,ans);
    }
}
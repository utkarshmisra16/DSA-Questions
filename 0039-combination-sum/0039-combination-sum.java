class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findComb(0, target, candidates, new ArrayList<>(), ans);
        return ans;
    }
    private void findComb(int idx, int target, int arr[], ArrayList<Integer> list, List<List<Integer>> ans){
        if(idx == arr.length){
            if(target == 0){
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        if(arr[idx] <= target){
            list.add(arr[idx]);
            findComb(idx, target-arr[idx], arr, list, ans);
            list.remove(list.size()-1);
        }
        findComb(idx+1, target, arr, list, ans);
    }
}
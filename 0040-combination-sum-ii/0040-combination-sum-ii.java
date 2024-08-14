class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        findComb(0, target, candidates, ans, new ArrayList<>());
        return ans;
    }
    private void findComb(int idx, int target, int arr[], List<List<Integer>> ans, ArrayList<Integer> list){
        if(target == 0){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=idx; i<arr.length; i++){
        if(i>idx && arr[i] == arr[i-1])
            continue;

        if(arr[i] > target)
            break;
        list.add(arr[i]);
        findComb(i+1, target - arr[i], arr, ans, list);
        list.remove(list.size()-1);
        }
    }
}
class Solution {
    // storing the final ans
    public List<List<Integer>> finalList = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer> list = new ArrayList<>();

        findCombination(candidates, target, list, 0,0);

        return finalList;
    }

    public void findCombination (int[] candidates, int target, List<Integer> list, int sum, int index){
        //Base condation.
        if(sum == target){
            finalList.add(new ArrayList(list));
            return; 
        }
        
        if(sum > target){
            return;
        }

        for(int i = index; i < candidates.length; i++){

            // ✅ skip duplicates
            if (i > index && candidates[i] == candidates[i - 1]) {
                continue;
            }

            list.add(candidates[i]);

            // ✅ FIX: use i + 1 (not ++index)
            findCombination(candidates, target, list, sum + candidates[i], i + 1);

            // Backtracking
            list.remove(list.size()-1);
        }
    }
}
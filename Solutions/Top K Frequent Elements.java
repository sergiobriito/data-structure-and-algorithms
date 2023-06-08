class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int n: nums){
            map.put(n, map.getOrDefault(n,0)+1);
        };

        ArrayList<Map.Entry<Integer,Integer>> entrySet = new ArrayList<>(map.entrySet());
        Collections.sort(entrySet, Comparator.comparingInt(Map.Entry::getValue));

        int[] ans = new int[k];

        for (int i=0;i<k;i++){
            ans[i] = entrySet.get(entrySet.size() - 1 - i).getKey();
        };

        return ans;
        
    }
}
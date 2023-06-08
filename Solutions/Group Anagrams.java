class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for (int i=0;i<strs.length;i++){
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            String strSorted = new String(charArray);

            if (map.containsKey(strSorted)){
                ArrayList<String> currArrayValues = map.get(strSorted);
                currArrayValues.add(strs[i]);
                map.put(strSorted, currArrayValues);
            }else{
                ArrayList<String> newArray = new ArrayList<>();
                newArray.add(strs[i]);
                map.put(strSorted, newArray);
            };
        };

        return new ArrayList<>(map.values());

    }
}
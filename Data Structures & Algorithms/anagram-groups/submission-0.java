class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList();
        }
        Map<String, List<String>> values = new HashMap<>();
        for (String word: strs) {
            char[] array = word.toCharArray();
            Arrays.sort(array);
            String sortedStr = new String(array);

            values.computeIfAbsent(sortedStr, k -> new ArrayList()).add(word);
        }
        return new ArrayList(values.values());
    }
}

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int i: nums) {
            int count = 1;
            if (frequency.containsKey(i)) {
                count = frequency.get(i) + 1;
            }
            frequency.put(i, count);
        }
        return frequency.entrySet().stream()
            .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
            .limit(k)
            .map(Map.Entry::getKey).mapToInt(Integer::intValue) 
            .toArray();
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> values = new HashMap<>();
        for (int i = 0; i<nums.length; i++) {
            values.put(nums[i], i);
        }
        for (int i=0; i<nums.length; i++) {
            int req = target - nums[i];
            if (values.containsKey(req) && values.get(req) != i) {
                return new int[]{i, values.get(req)};
            }
        }
        return new int[2];

    }
}

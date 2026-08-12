class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> unique = new HashSet<Integer>();
        for (int i = 0; i<nums.length; i++) {
            boolean returnItem = unique.add(nums[i]);
            if (!returnItem) {
                return true;
            }
        }
        return false;
    }
}
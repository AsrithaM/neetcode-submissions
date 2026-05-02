class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        nums.indices.forEach { i ->
            nums.indices.forEach { j ->
                if(i != j && nums[i] + nums[j] == target) {
                    return intArrayOf(i, j)
                }
            }
        }
        return intArrayOf()
    }
}

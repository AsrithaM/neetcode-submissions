class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val productNums = IntArray(nums.size){1}
        for(i in 0..nums.size-1) {
            var product = 1
            for(j in 0..nums.size-1) {
                if(j != i) {
                    product *= nums[j]
                }
            }
            productNums[i] = product
        }
        return productNums
    }
}

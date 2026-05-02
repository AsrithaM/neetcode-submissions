class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val sortedArray = nums.sortedArray()
        sortedArray.forEach {
            val index = sortedArray.indexOf(it)
            if((index != sortedArray.size - 1) && it == sortedArray[index+1]){
                return true
            }
        }
        return false
    }
}

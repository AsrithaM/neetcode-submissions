class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val array = IntArray(k)
        val hashmap: HashMap<Int, Int> = hashMapOf()
        nums.forEach { hashmap[it] = hashmap.getOrDefault(it, 0) + 1 }
        val sortedDescending = hashmap.toList()
                                    .sortedByDescending { it.second }
                                    .toMap()
        for(i in 0 until k) {
            val keys = sortedDescending.keys.toList()
            array[i] = keys[i]
        }

        return array
    }
}
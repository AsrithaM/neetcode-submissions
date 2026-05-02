class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val list : MutableList<MutableList<String>> = mutableListOf()
        var listIndex = 0
        val visitedAndAnagramFound = BooleanArray(strs.size)
        for(i in 0 until strs.size) {
            if(!visitedAndAnagramFound[i]){
                list.add(mutableListOf(strs[i]))
                for (j in i+1..(strs.size-1)) {
                    if(!visitedAndAnagramFound[j] && isAnagram(strs[i], strs[j])) {
                        val innerList = list[listIndex]
                        innerList.add(strs[j])
                        visitedAndAnagramFound[j] = true
                    }
                }
                listIndex++
            }
        }
        return list
    }

    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false
        val count = IntArray(26)

        for(i in s.indices) {count[s[i] - 'a']++}
        for(i in t.indices) {count[t[i] - 'a']--}

        return count.all { it == 0 }
    }
}
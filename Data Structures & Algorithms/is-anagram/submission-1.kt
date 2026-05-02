class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        val chars = mutableListOf<Char>()
        if(s.length >= t.length) {
            s.forEach{
                chars.add(it)
            }
            t.forEach{
                chars.remove(it)
            }
        } else {
            t.forEach{
                chars.add(it)
            }
            s.forEach{
                chars.remove(it)
            }
        }
        return if(chars.size > 0) false else true
    }
}

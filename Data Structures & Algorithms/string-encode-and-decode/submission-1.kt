class Solution {

    fun encode(strs: List<String>): String {
        val stringBuilder = StringBuilder()
        strs.forEach { it ->
            stringBuilder.append(it.length)
            stringBuilder.append("#")
            stringBuilder.append(it)
        }
        return stringBuilder.toString()
    }

    fun decode(str: String): List<String> {
        val list = mutableListOf<String>()
        var i = 0
        val numberBuilder = StringBuilder()
        while(i < str.length) {
            if(str[i].isDigit()){
                numberBuilder.append(str[i])
                i++
            } else if(str[i] == '#') {
                val num = numberBuilder.toString().toInt()
                val stringBuilder = StringBuilder()
                i++
                if(num == 0) {
                    list.add("")
                } else {
                    for(j in 0..num-1) {
                        stringBuilder.append(str[i+j])
                    }
                    list.add(stringBuilder.toString())
                }
                i = i + num
                numberBuilder.clear()
                stringBuilder.clear()
            }
        }
        return list
    }
}

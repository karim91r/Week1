package Ipv4_project
fun main() {
}
fun isValidIpv4(ip:String):Boolean{
    val segments:List<String> = ip.split(".")
    if(segments.size!=4) return false
    for(segment in segments){
        if(segment.startsWith("0")&&segment.length>1) return false
        if (segment.all{it.isDigit()}){
            val number=segment.toInt()
            if(number!in 0..255) return false
        }
        else return false
    }
    return true
}
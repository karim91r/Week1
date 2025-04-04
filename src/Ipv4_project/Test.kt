package Ipv4_project

fun main(){
    test(
        name="Returns true for a valid IPv4 address in range ( 0 to 255)",
        result = isValidIpv4("192.168.1.1"),
        correctResult = true
    )
    test(
        name="Returns false for address with leading zeros in a segment",
        result = isValidIpv4("192.168.01.1"),
        correctResult = false
    )
    test(
        name="Returns false for address with an extra dot",
        result = isValidIpv4("192.168.1.1."),
        correctResult = false
    )
    test(
        name="Returns false for address with fewer than four segments",
        result = isValidIpv4("192.168.1"),
        correctResult = false
    )
    test(
        name="Returns false for address with non-numeric characters",
        result = isValidIpv4("192.168.a.1"),
        correctResult = false
    )
}

fun<T> test(name:String,result:T,correctResult:T){
    if(result==correctResult){
        println("success -$name")
    }
    else{
        println("Field -$name")
    }
}

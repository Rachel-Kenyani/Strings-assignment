fun main() {
    val school="akirachix"
    println(school[0].toString()+school[2]+school[3])

    intro("May",20)

    string1("Dignity")

    fullName("Marie")
}
fun intro(x:String,y:Int):String{
    var greeting="Hi, my name is $x and I am $y years old."
    return greeting
}
fun string1(name:String):Int {
    var length = name.length
    return length
}
fun fullName(name:String){
    if ( name=="Imali") {
        println("That's me.")
    } else {
        println("I don't know who that is.")
}}

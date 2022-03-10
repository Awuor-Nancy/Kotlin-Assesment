fun main() {
var result=name.length
    println(result)

    var response=name("Nancy","20")
    println(response)

    var answer=numbers(10,3)
    println(answer)
    
    var show=String("codeHive")
    println(show)


}
    //No 4.
var name="Nancy"
var output=name

fun name(name:String,age:String):String {
    var greeting="Hi,my $name is and i am $age years old "
    return greeting
    
 


}
    //No 2.
fun numbers(num1:Int,num2:Int):Int {
    var output=num1%num2
    return output

}
  // No 1
fun String(Strng:codeHive):String {
    var campus="codHive"
    println(campus[4])
    println(campus[5])
    println(campus[6])
    var see= (campus[4].toString()+campus[5].toString+campus[6])
    return(see)



}






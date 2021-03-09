
/*
 *@author is Akhil Menon
 * Github ID: Akhmen18
 */
fun main(){
    //print("Welcome to code basics of Kotlin") ----> Basic Print Statement
    val intro = "Welcome to code basics of Kotlin"
    var name = "Tutor"
    println(intro+" Mr."+name)
    //intro = "akaka"  Will give you an error as val variable can't be changed. That is it is Immutable
    /*
    * var is mutable variable
    * val is immutable variable
    * */

    //Lets take a look at the variables in Kotlin now
    val myInt : Int = 32 //Requires 32 bits in memory
    val myByte: Byte = 13 //Requires 8 bits in memory
    val myShort: Short = 125 //Requires 16 bits in memory
    val myLong: Long = 12_345_678_009_003 //Requires 64 bits in memory
    /*
    * In the above example I've explicitly mentioned the type using the colon.
    * Eg: var variable_name: type_of_data = value_assigned
    * NOTE: In kotlin it isn't necessary for us to explicitly mention the type of data. Kotlin's compiler automatically assumes it depending on the assignment of data.
    * */

    // val egByte: Byte = 1234 this wil give an error cause the data value is more than 8bits in memory hence a byte type can't store it.

    //Floating Point numbers: Float(32 bit), Double(64 bit)
    val myFloat:Float = 3.14F
    val myDouble:Double = 3.141592653589793238462

    //Boolean is a type used to represent and use logical values. Possible values: true and false
    val myBool: Boolean = true
    val myBoolCopy: Boolean = false

    //Character type of Data. used to store Character type of data.
    val myChar: Char = 'a'
    val myCharCopy = '1'
    //Here both a and 1 are characters. 1 isn't a number here

    //String: This type is used to store list of characters
    val myString: String = "Example of a String"
    //We can slice strings:
    var firstChar = myString[0] //gives first character of the string
    firstChar = myString[myString.length-1] //gives the last character of the string.

    /*Arithmetic Operations :
    * Addition(+)
    * Subtraction(-)
    * Multiplication(*)
    * Division(/)
    * Modulo(%)
    */
    var a = 10
    var b = 20
    var result: Int
    result = a+b
    println("Addition:"+result)
    result = b-a
    println("Subtraction:"+result)
    result = a*b
    println("Multiplication:"+result)
    result = b/a
    println("Division:"+result)
    result = a%b
    println("Modulo:"+result)
}

//Basics Functions:

fun add() {
    var one = 1
    var two = 2
    println("Sum is ${one+two}")
}

fun add2() : Int {
    var one = 1
    var two = 2
    var sum : Int?
    sum = one+two
    return sum
}
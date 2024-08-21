/*
fun main() 
{
    var a = 40
    println(a)
    val b = 80
    b = 70
    print(b)
    
    var a = 40
    var b : String = "Hello"
    println(a)
    print(b)
    
    val kotlin = "hello"
    println(kotlin)
   
}


---------------------------------------------
class person
{
    var kotlin = "hello"
    fun displayinfo()
    {
        println(kotlin)
    }
}

fun main()
{
    val person = person()
    person.displayinfo()
}
---------------------------------------------
fun main(){
    val a = 10
    val b = 20
    val result = "sum of $a and $b is ${a + b}"
    println(result)
}
---------------------------------------------
fun main(){
    val letter: Char
	letter = 'A'
    print("$letter")
    print('\n')
    println('\$')
    print('\\')
}
------------------------------------------
fun main(){
    val name: String
    name = 
   """kowsik
kowsik
kowsik
kowsik
kowsik"""
    print("$name")
}
----------------------------------------
fun main(){
    val name: String
    name = 
   		"""kowsik
    kowsik
        kowsik
            kowsik
                kowsik"""
    print("$name")
}
---------------------------------------
fun main(){
    val name: String
    name = 
   	"""	kowsik
kowsik		kowsik
	kowsik"""
    print("$name")
}
-------------------------------------

fun main() {
    val numbers = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val words: Array<String> = arrayOf("Navneet", "Navneet", "Navneet", "Navneet", "Navneet", "Navneet")
    
    val squares = Array(5) { i -> i * i }
    numbers[0] = 10
    println(numbers[0])
   
   println(words[1])
   
 	squares[0] = 10
    println(squares[0])
}


 
 
 
 fun main() {
    val numbers = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val words: Array<String> = arrayOf("Navneet", "Navneet", "Navneet", "Navneet", "Navneet", "Navneet")
    
    val squares = Array(5) { i -> i * i }

   
     
     for( num in numbers){
         println(num)
     }
     
     for( name in words){
         println(name)
     }
}


fun main() {
    val numbers = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val words: Array<String> = arrayOf("Navneet", "Navneet", "Navneet", "Navneet", "Navneet", "Navneet")
    
    val squares = Array(5) { i -> i * i }
    numbers[0] = 10
    println(numbers[0])
   
   println(words[1])
   
 	squares[0] = 10
    println(squares[0])
}


 
 
 fun main() {
    val matrix: Array<Array<Int>> = arrayOf(arrayOf(1, 2, 3), arrayOf(4, 5, 6))
 
	println(matrix[1][1])
    
   
     /*
      for( num in numbers){
         println(num)
     }
     
     for( name in words){
         println(name)
     }
     */
}




4
fun main(){
   val x:Int = 100
    val y:Long = x.toLong()
    println(y)
}






fun main(){
    var a = "hi"
    var b:String = a as String 
    
    println("unsafe casting result ${b}")
    
 
    var c:String? = a as? Int 
    
    if (null != c){
        println("safe type casting result: ${c}")
        
    }
    else {
        println("safe casting invalid")
    }
    
    
}



*/

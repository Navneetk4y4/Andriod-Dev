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


------------------------------------------------------------------------------------------------------------------------------------------------
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

------------------------------------------------------------------------------------------------------------------------------------------------

fun main(){
    val a = 10
    val b = 20
    val result = "sum of $a and $b is ${a + b}"
    println(result)
}

------------------------------------------------------------------------------------------------------------------------------------------------

fun main(){
    val letter: Char
	letter = 'A'
    print("$letter")
    print('\n')
    println('\$')
    print('\\')
}

------------------------------------------------------------------------------------------------------------------------------------------------

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

------------------------------------------------------------------------------------------------------------------------------------------------

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

------------------------------------------------------------------------------------------------------------------------------------------------

fun main(){
    val name: String
    name = 
   	"""	kowsik
kowsik		kowsik
	kowsik"""
    print("$name")
}

------------------------------------------------------------------------------------------------------------------------------------------------

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


 

------------------------------------------------------------------------------------------------------------------------------------------------
 
 
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


------------------------------------------------------------------------------------------------------------------------------------------------


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


 

------------------------------------------------------------------------------------------------------------------------------------------------

 
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





------------------------------------------------------------------------------------------------------------------------------------------------

fun main(){
   val x:Int = 100
    val y:Long = x.toLong()
    println(y)
}




------------------------------------------------------------------------------------------------------------------------------------------------


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


-----------------------------------------------------operators---------------------------------------------------------------------------------

fun main() {
    var a = 10
    var b = 5
    val isTrue = true
    val isFalse = false
    var add = a+b
    //println("Result of $a + $b = $add")
    //println("Result of $a * $b = ${a*b} ")
    //println("Result of $a / $b = ${a/b} ")
    //println("Result of $a - $b = ${a-b} ")
    //println("Result of $a % $b = ${a%b} ")
    
    
  
    
    //println("Result of $a < $b = ${a<b} ")
    //println("Result of $a > $b = ${a>b} ")
    //println("Result of $a == $b = ${a==b} ") 
    //println("Result of $a >= $b = ${a>=b} ")
    //println("Result of $a <= $b = ${a<=b} ")
    //println("Result of $a != $b = ${a!=b} ")
    
    
    
    //println("Result of --a ${--a}")
    //println("Result of ++a ${++a}")
    

    
    println("Result of $isTrue && $isFalse = ${isTrue && isFalse}")
    println("Result of $isTrue || $isFalse = ${isTrue || isFalse}")
    println("Result of !$isTrue   = ${!isFalse}")
  
    
    
    
    
    
}


-----------------------------------------------------------------------------control flow statement----------------------------- 




-----------------------------if-else-----------------




fun main(){
   val temperature = 2
   if(temperature > 20){

    println("it's a warm day")

   }
   else{

    println("good weather ")
   }

}


fun main(){
    val age = 18
    if(age  >= 18){
 
     println("print licence")
 
    }
    else{
 
     println("can't print licence")
    }
 
 }







fun main(){
    val score = 85
    if(score  >= 90){
 
     println("Grade is A")
 
    }
    else if(score  >= 70){
 
        println("Grade is B")
    
       }
    else if(score  >= 70){
 
        println("Grade is C")
    
       }
    else{
 
     println("Grade is D")
    }
 
 }







fun main(){
    val A = 85
    val B = 30
    val O = "/"
    if(O == "+"){
 
     println("Sum is  ${A+B}")
 
    }
    else if(O == "-"){
 
        println("Diffrence is  ${A-B}")
    
       }
    else if(O == "*"){
 
        println("Product is  ${A*B}")
    
       }
    else if(O == "/"){
        if(B != 0 ){
     println("Division is ${A/B}")
        }
        else{
            println("Error ")
        }
    }
    else{
        println("invalid input")
    }
 
 }


fun main(){
    val age = 15
    if(age  < 13){
 
     println("Child")
 
    }
    else if(age >=13 && age <=19){
 
        println("Teenager")
    
       }

    else{
 
     println("Adult")
    }
 
 }




-----------------------------when-----------------

fun main(){
    val DayOfWeek = 3

    val DayName = when(DayOfWeek){

        1-> "Monday"
        2-> "Tuesday"
        3-> "Wednesday"
        4-> "thursday"
        5-> "Friday"
        6-> "Saturday"
        7-> "Sunday"
        else -> "Invalid Input"
    }

    println(DayName)
}






fun main(){

    val number = 23

    when{
        number%2 == 0 -> println("Number is even")
        number%2 != 0 -> println("Number is odd")
        else -> println("Invalid input ")
    }
}



-------------------------For Loop-----------------------------------------





//-------------------------funtions----------------------------------------

fun sum(a:Int = 10 , b:Int=20)
{
     val c = a+b
     println(c)
}

fun main(){
    sum(20,50)
    sum()
}




fun sum(a:Int, b:Int ){
    val c=a+b
    println(c)
}

fun main(){
    sum(20,70)
}




//----------------using return ----------------------



fun main(){
    val a = 10
    val b = 20

    val result = sum(a, b)

    println(result)
}

fun sum(a:Int , b:Int):Int{

    val x = a+b

    return x
}


fun factorial(n:Int): Int{
    return if( n<= 1) 1 else n*factorial(n-1)

}
*/







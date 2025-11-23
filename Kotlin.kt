/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
// fun eatAcake() = println("Eat a cake")
// fun bakeAcake() = println("Bake a cake")
fun main() {
    var x=3000
    
    println("Hello, world!")//println() adds a newline
    println("Namaste $x")//print() does not adds a newline
    
    val y: Int = 10//immutable(cannot be reassigned)
    var name: String = "Sumit"
    println("Name's $name")
    
    var myName: String?=null
    myName.let{
        println(myName)
    }
    
    val value: Int=if(true){
        println("True")
        10
    }
    else 20
    println(value)
    
    val name1="Vicky"
    val z = when(name1){
        "Vicky"-> println("Excellent")
        "Priyanshu"->println("Okay")
        else->println("Gadha")
    }
    println(z)
    
    val names = arrayOf("Jaya","Saniya","Kowsar")
    println(names)
    for(i in names){
        println(i)
    }
    names.forEach{
        println(it)
    }
    
    val cakes = listOf("Chocolate","Cream","Egg")//Lists are immutable by default in kotlin
    for(i in cakes){
        println("It's a $i cake")
    }
    
    
//     var cakesEaten=0
//     var cakesBaked=0
//     while(cakesEaten<5){
//         eatAcake()
//         cakesEaten++
//     }
//     do{
//         bakeAcake()
//         cakesBaked++
//     }while(cakesBaked<cakesEaten)
    
    for(i in 0..9){
        print(i)
    }
    print(" ")
    for(i in 2..10 step 2){
        print(i)
    }
    print(" ")
    for(i in 3 downTo 0){
        print(i)
    }
    println(" ")
    
    var n=2
    if(n in 1..10){
        print("Yes")
    }
    else if(n !in 10..100){
        print("No")
    }
    
    val friends = mutableListOf("Nagesh","Priyapati","Udhay",10)//mulitiple data types accepted in a list
    friends[2] = "Sahil"
    for(i in friends){
        println(i)
    }
    val friends2 = mutableListOf<String>("Sudhanshu","Shainky","Shanu","Shoeb")//will only accept string data type
    println(sum(2,98))
    println(product(50,2))
    greeting("Morning")
    greetings(naam="Sumit",greet = "Nice")
    greetings(naam="Rajnish")
    
    val output=operation(4,5, {a,b -> 
        print("Addition: ")
        var temp= a*a*a//a=a*a*a won't work as val cannot be reassigned
        temp+b//Last line,returns automatically
    })
    println(output)
    
    val p1=Person("Anuj Kumar Sharma")
    println(p1.nam)
    val p2=Janta("Anurag Sharma")
    println(p2.hai)
    val user1 = User("Utkarsh",1)
    println(user1)
    val user2 = User("Utkarsh",1)
    println(user2)
    val user3 = User("Satvik",2)
    println("user1==user2;${user1==user2}")//same value?
    println("user1==user2;${user1===user2}")//same reference?
    println(user1.hashCode())
    
    val list = listOf<Int>(1,2,3,4,5,6,7,8,9,10)
    var newList = list.filter({
        it%2==0
    }).forEach({
        println("$it")
    })
    
    var newL = list.filter({//filter elements
        it%2==0
    }).map({//transforms the list elements
        it*it
    }).
        forEach({
        println("$it")
    })
    
    
}



fun sum(a: Int, b: Int): Int{
    return a+b
}
fun product(a: Int, b: Int): Int = a*b
fun greeting(greet: String="Bye"){//default value set to Bye if no greeting given
    println("Good $greet")
}
fun greetings(greet: String="Good",naam: String){
    println("Congratulations $naam,Have a $greet Day")
}

//Higher Order functions
fun operation(a: Int,b: Int, operate:(Int,Int)->Int):Int{//Unit here means void,means returns nothing
    return operate(a,b)
}

//Object Oriented Programming
class Person(_nam: String){
    val nam: String
    init {
        nam = _nam
    }   
}
class Janta(val hai: String)

data class User(val student:String, val id:Int)

//<iframe src="https://pl.kotl.in/Rte_EHjNQ"></iframe>
//https://pl.kotl.in/3yZa3hL93
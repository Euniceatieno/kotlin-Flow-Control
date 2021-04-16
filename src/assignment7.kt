fun main() {
    oddNumbers()
    println(checkArray("Natalia","Mellisa","Kotlin","Star","Akira"))
    decisions(5)
    decisions(11)
    decisions(40)
    checkNumber()

}
fun oddNumbers(){
    for(numbers in 1..100 step 2){
        println(numbers)

    }
}
fun checkArray(a:String,b:String,c:String,d:String,e:String):Int{
    var myArr=arrayOf(a,b,c,d,e)
    var countArr=0
    for(n in myArr) {
        if (n.length > 5){
            countArr++
        }
    }
        return countArr





}
fun decisions(age:Int){

    if(age<6){
        println("A glass of milk")
    }
    else if(age<15 && age>6){
        println("A bottle of fanta Orange")
    }
    else{
        println("A bottle of cocacola ")
    }
}
fun checkNumber(){
    for(nums in 1..100){
        if(nums%3==0){
            println("Fizz")
        }
        if (nums%5==0){
            println("Buzz")
        }
        if(nums%3==0 && nums%5==0){
            println("Fizzbuzz")
        }
        if(nums%3!==0 && nums%5!==0){
            println(nums)

        }

    }

}
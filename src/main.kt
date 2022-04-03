fun main(){
    println("hello pj")
    oddNumber()
    arraylength(arrayOf("phelisia","Kibet","Lynette","Nkimalantoi"))
    robotserve(5)
    robotserve(15)
    robotserve(50)
    mutplethreeandfive()
}
fun oddNumber(){

        for (odd in 1..100) {
            if(odd%2==1){
                println(odd)
            }


        }

}
fun arraylength(namee:Array<String>):Int{
    var x=0
    namee.forEach { nam->
        if(nam.length>5){
            println(nam)

        }

    }

return  x

}
fun robotserve(age:Int){
    if(age<6){
        println(" age $age you are taking milk")

    } else if (age<= 15){
println("age $age you are taking fanta orange")

    }else{
        println("age $age you are taking soda ")
    }




}
fun mutplethreeandfive(){
    for (mutiple in 1..1000){
        if(mutiple%3==0 && mutiple%5==0){
            println("FizzBuzz")
    }else if (mutiple%5==0){
        println("Buzz")
        } else if(mutiple%3==0 ){
            println("Fizz")

        }

        }

}
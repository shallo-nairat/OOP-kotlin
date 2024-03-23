import java.net.CookieHandler

fun main() {
    val student=Student("Gloria",23,45.6)
    student.read("read")
    student.speak("")

    val food=Food("Indian", 2)
    food.taste("pilau")
    food.uncooked("")
}
class Student(var name:String,var age:Int,var weight:Double) {
    fun read(read:String ){
        println("I have $read a new novel this week ")

    }

     fun speak(speech: String) {
        println("I really enjoy reading novels")
    }


    }
class Food ( var type:String,  var variety:Int,){
    fun taste(name:String ){
        println("Today we ate $name and it was so delicious ")

    }

    fun uncooked(uncook: String) {
        println("The food at that restaurant is not tasty")
    }


}
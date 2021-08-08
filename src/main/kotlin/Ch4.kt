/*fun main(){

    //Rectangles (pg 226)
    /*val r = arrayOf(Rectangle(1, 1), Rectangle(1, 1),
                    Rectangle(1, 1), Rectangle(1, 1))

    for(x in r.indices) {
        r[x].width = (x + 1) * 3
        r[x].height = x + 5
        print("Rectangle $x has area ${r[x].area}. ")
        println("It is ${if(r[x].isSquare) "" else "not "}a square.")
    }*/



    //Playing with dogs (pg 222)
    /*val myDog = Dog("Baruk", 120, "Border Collier")

    myDog.bark()

    myDog.weight = 130

    println("Weight in kgs is ${myDog.weightInKgs}")

    myDog.weight = -2

    println("Weight is ${myDog.weight}")

    myDog.activities = arrayOf("walks", "swimming", "catching")

    for(activity in myDog.activities){
        println("${myDog.name} enjoys $activity")
    }

    val dogs = arrayOf(Dog("Kelpie", 20, "Westie"),
                       Dog("Ripper", 10, "Poodle"))

    dogs[1].bark()
    dogs[1].weight = 15
    println("Weight for ${dogs[1].name} is ${dogs[1].weight}.")*/




    //Playing the drums (pg 203)
    /*val d = DrumKit(true, true)
    d.playTophat()
    d.playSnare()

    d.hasSnare = false
    d.playTophat()
    d.playSnare()*/




    //Playing songs (pg 194)
    /*val song1 = Song("Sanitarium", "Metallica")
    val song2 = Song("Young Folks", "Peter, Bjorn and John")
    val song3 = Song("Dogs", "Pink Floyd")

    song1.play()
    song1.stop()
    song3.play()*/
}*/






class Song(val title: String, val artist: String) {
    fun play() {
        println("Playing the song $title by $artist.")
    }

    fun stop(){
        println("Stoped playing $title.")
    }
}

class DrumKit(var hasTophat: Boolean, var hasSnare: Boolean){
    fun playTophat(){
        if(hasTophat) println("ding ding ba-da-ding!")
    }

    fun playSnare(){
        if(hasSnare) println("bang bang bang!")
    }
}

class Dog(val name: String,
           weight_param: Int,
           breed_param: String) {
    init {
        print("Dog $name has been created. ")
    }

    var activities = arrayOf("Walks")

    val breed = breed_param.toUpperCase()

    init {
        println("The breed is $breed.")
    }

    var weight = weight_param
        set(value) {
            if(value > 0) field = value
        }

    val weightInKgs : Double
        get() = weight / 2.2

    fun bark() {
        println(if(weight < 20) "Yip!" else "Woof!")
    }
}


class Rectangle(var width: Int, var height: Int) {
    val isSquare: Boolean
        get() = (width == height)

    val area: Int
        get() = (width * height)
}
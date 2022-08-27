// Functions

// Creating and Calling a Function
fun smores() {
  println("Roast a marshmallow.")
  println("Place marshmallow on a graham cracker.")
  println("Place chocolate on marshmallow.")
  println("Put a new graham cracker on chocolate.")
  println("Enjoy!")
}

fun main() {
  smores() 
}

// Arguments
fun getSpeed(distance: Int, time: Int) {
  var speed = distance / time
  println("$speed meters per second")
}

fun main() {
    getSpeed(10, 3) 
}

// Named and Default Arguments
fun getPrice(price: Double, couponCode: String = "None") {
  var finalPrice: Double

  if (couponCode == "save15") {
    finalPrice = price * .85
  } else {
    finalPrice = price
  }
 
 println("The total price is $finalPrice.")
}

fun main() {
  getPrice(price = 48.0, couponCode = "save15")  
}

// Return Statements
fun ozToTsp(oz: Double): Double {
  var tsp = oz * 6
  return tsp
}

fun main() {
  var tspNeeded = ozToTsp(.75)
  println("You will need $tspNeeded tsp of vanilla extract for this recipe.")
}

// Single Expression Functions
fun pyramidVolume(l: Int, w: Int, h: Int) = (l * w * h) / 3

fun main() {
  var length = 5
  var width = 8
  var height = 14

  var volume = pyramidVolume(length, width, height)
  println("The volume of this pyramid is $volume.")
}

// Function Literals
fun main() {
  // anonymous function 
  var area = fun(base: Int, height: Int): Int {
    return (base * height) / 2
  }
  println(area(15, 19))

  // lambda expression
  var perimeter = {side1: Int, side2: Int -> (side1 + side2) * 2}
  println(perimeter(15, 24))
}

/*
  - A function is a reusable block of code that can be invoked throughout a program.
  - In order to execute a function, it must be called somewhere in the program.
  - An argument is a piece of data fed to the function.
  - Arguments have the option to be named and/or given default values.
  - A return statement returns a piece of data from the function to where the function was called.
  - Functions with only a single expression can be written with a single line of code using shorthand syntax.
  - A function literal is an unnamed function that can be passed as an expression.
*/



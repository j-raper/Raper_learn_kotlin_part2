// Class

// Creating a Class
class Book {
  val pages = 320
  val title = "Harry Potter and the Sorcerer's Stone"
  val author = "J.K. Rowling"
}

fun main() {
  
}

// Creating an Instance
class Building {
  val yearBuilt = 2016
  val height = 400 // ft
  val type = "Limestone"
}

fun main() {
  var residentialBuilding = Building()
  println(residentialBuilding.yearBuilt) 
  println(residentialBuilding.height)
  println(residentialBuilding.type)
}

// Primary Constructor
class Person(val name: String, val age: Int, val favoriteColor: String)

fun main() { 

  val me = Person("Maggie", 26, "Green")
  val myFriend = Person("Jose", 25, "Red")

  println("${me.name} is ${me.age} years old and my favorite color is ${me.favoriteColor}.")
  println("${myFriend.name} is ${myFriend.age} years old and their favorite color is ${myFriend.favoriteColor}.")

}

// The Init Block
class Employee(val firstName: String, val lastName: String, val yearsWorked: Int) {
  val fullName = "$firstName $lastName"

  init {
    if (yearsWorked > 1) {
      println("$fullName is eligible for a raise!")
    } else {
      println("$fullName is not eligible for a raise just yet.")
    } 
  }
} 

fun main() {
  val projectManager = Employee("Maria", "Gonzalez", 2)
}

// Member Functions
class Dog(val name: String, val breed: String, val competitionsParticipated: List<String>) {
  
  init {
    for (comp in competitionsParticipated) {
      println("$name participated in $comp.")
    }
  }

  fun speak() {
   println("$name says: Woof!")
  }
}

fun main() {
  var maxie = Dog("Maxie", "Poodle", listOf("Westminster Kennel Club Dog Show", "AKC National Championship"))
  maxie.speak()

}

/*
  - A class is an object-oriented concept which resembles a blueprint for individual objects. A class can contain properties and functions and is defined using the class keyword followed by a name and optional body.
  - An instance is a member of a class created by calling the class name followed by a pair of parentheses, (), and any necessary arguments.
  - We can use dot syntax to access the value of each class property.
  - A class can have properties with default values or ones that are customizable with the help of primary constructors.
  - A primary constructor allows us to set each property value when we instantiate an object.
  - The init block gets invoked with every instance creation and is used to add logic to the class.
  - A function declared within a Kotlin class is known as a member function of that class. In order to invoke a member function, we must call the function on an instance of the class.
*/

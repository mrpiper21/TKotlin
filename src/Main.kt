fun main() {
    // comparing String
    val str1: String = "Brocolli"
    val str2: String = "Brocolli"

    println(str1.compareTo(str2))

    val Name: String = "Bernard Baah";
    println(Name.getOrNull(Name.length - 2))

    // Arrays
    val fruits = arrayOf<String>("Mango", "apple", "Melon", "Guava")
    println("first fruit is: ${fruits[0]}")
    // Set the value at 3rd index
    fruits.set(3, "pawpaw")
    println("value ant 3rd index is ${fruits[3]}")
    val evenNums = arrayOf<Int>(2, 4, 6, 8, 10)
    println("second even number is ${evenNums[1]}")

    println("Size of the array is ${evenNums.size}")

    // Loop through an array
    for(item in fruits){
        println(item);
    }

    // check if an Element Exists
    if(3 in evenNums){
        val i = evenNums.indexOf(6)
        evenNums.set(i, 7)
        println("The value of 6 if now ${evenNums[i]} in the array")
    } else {
        println("6 does not exist in evenNumbers")
    }

    // Distinct values from an array
    val distinct = fruits.distinct()
    for(item in distinct){
        println("distinct $item")
    }

    // Dropping Elements from Array
    // dropping first 2 elements
    val result = fruits.drop(2)
    for (item in result){
        println(item)
    }

    // Checking an Empty Array
    println("Array is empty : ${fruits.isEmpty()}")
}
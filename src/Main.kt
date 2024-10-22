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

    // Ranges
    for(num in 1.rangeTo(4)){
        println(num)
    }
    //OR
    for(num in 1..4){
        println(num)
    }

    // Backward range
    for(num in 4 downTo 1){
        println(num)
    }

    println((5..10).first)
    println((5..10 step 2).step)
    println((5..10).reversed().last)

    val a = 1..10
    val f = a.filter { Item -> Item % 2 == 0 }
    println("filtered ${f}")

    val b = listOf(1, 1, 2, 2, 4, 5, 4, 6, 20)
    println("Distinct ${b.distinct()}")

    val c = 1..10
    println("min ${c.min()}")
    println("max ${c.max()}")
    println("sum ${c.sum()}")
    println("average ${c.average()}")
    println("count ${c.count()}")
}
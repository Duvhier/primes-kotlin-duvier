fun main() {
    val numbers = listOf(1, 2, 4, 7, 13, 9, 23)

    // Map applies the isEven function to each element of the list
    val evenResult = numbers.map { isEven(it) }

    println("Numbers: $numbers")
    println("Are they even?: $evenResult")
}

// Function that checks if a number is even
fun isEven(n: Int): Boolean {
    return n % 2 == 0
}

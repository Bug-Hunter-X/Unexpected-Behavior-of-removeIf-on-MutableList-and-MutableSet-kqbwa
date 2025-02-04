fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val newList = list.filter { it <= 2 }
    println(newList) // Output: [1, 2]

    val set = mutableSetOf(1, 2, 3, 4, 5)
    val newSet = set.filter { it <= 2 }
    println(newSet) // Output: [1, 2]
    
    // Example using a custom class. 
    data class Person(val id: Int, val name: String)
    val people = mutableListOf(Person(1, "Alice"), Person(2, "Bob"), Person(3, "Charlie"))
    people.removeIf { it.id > 2 }
    println(people) // Output: [Person(id=1, name=Alice), Person(id=2, name=Bob)]
} 
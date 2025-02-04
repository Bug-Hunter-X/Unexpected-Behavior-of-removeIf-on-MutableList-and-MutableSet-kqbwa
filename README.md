# Kotlin's removeIf() Function: Unexpected Behavior with Primitive Types and Custom Objects

This repository demonstrates a subtle difference in the behavior of the `removeIf()` function when used with `MutableList` and `MutableSet` in Kotlin, specifically when dealing with primitive types versus custom objects. This difference can lead to unexpected results if not understood and handled carefully.

## The Issue

The `removeIf()` function modifies the collection in place, removing elements that satisfy the provided predicate. While it works as expected with custom objects, it can lead to inconsistent behavior with primitive types.

## Reproduction Steps

1. Clone the repository.
2. Run the `Bug.kt` file. Observe the output for both `MutableList` and `MutableSet`. 
3. Run the `BugSolution.kt` file. Observe the correct usage and output.

## Solution

The solution lies in understanding the underlying implementation of `removeIf()`. For primitive types (like Int), the elements are compared by value. However, the use of custom objects should always consider that the equality (`==`) operator will likely be overridden and can potentially be slower.

## Recommendations

* Be mindful of using `removeIf` with primitive types for large lists or sets, as there can be performance consequences due to internal object creation.
* Consider alternative approaches when dealing with large datasets.   
* Always thoroughly test your code with various inputs, especially when using collection functions that modify the original data structure in place. 

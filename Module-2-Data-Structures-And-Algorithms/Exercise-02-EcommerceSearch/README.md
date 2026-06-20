# Exercise 02 - E-commerce Search

## Objective

Implement and compare Linear Search and Binary Search for finding products in an e-commerce product list.

## Problem Statement

An e-commerce platform must search products efficiently by product ID. This exercise compares a simple sequential approach with a faster divide-and-conquer approach.

## Implementation Details

| File | Responsibility |
| --- | --- |
| `Product.java` | Model class containing product ID, product name, and category |
| `LinearSearch.java` | Searches products one by one until the matching product ID is found |
| `BinarySearch.java` | Searches a sorted product array by repeatedly dividing the search range |
| `SearchTest.java` | Driver class that creates sample products, runs both searches, and prints execution time |

## Algorithms Used

### Linear Search

- Checks each product from start to end.
- Works on both sorted and unsorted arrays.
- Best case: `O(1)`
- Worst case: `O(n)`

### Binary Search

- Requires the product array to be sorted by product ID.
- Compares the target with the middle element and eliminates half of the search space.
- Best case: `O(1)`
- Worst case: `O(log n)`

## How to Run

Run these commands from the repository root:

```powershell
javac -d Module-2-Data-Structures-And-Algorithms/Exercise-02-EcommerceSearch/out Module-2-Data-Structures-And-Algorithms/Exercise-02-EcommerceSearch/src/com/cognizant/ecommercesearch/*.java
```

```powershell
java -cp Module-2-Data-Structures-And-Algorithms/Exercise-02-EcommerceSearch/out com.cognizant.ecommercesearch.SearchTest
```

## Expected Output

The execution time can vary on each run, but the searched product should be found by both algorithms.

```text
===== Linear Search =====
Product{productId=104, productName='Shoes', category='Fashion'}
Execution Time: <time in ns>

===== Binary Search =====
Product{productId=104, productName='Shoes', category='Fashion'}
Execution Time: <time in ns>
```

## Learning Outcome

This exercise demonstrates how algorithm choice impacts search performance and why Binary Search is preferred for large sorted datasets.

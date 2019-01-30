finding largest and smallest number in an array 
------------------------------------------------
first sort the array , complexity will be O(nlogn).
the get the first and last element using index whose complexity in O(1)

sum of two elements in array  whose sum is the given number
-----------------------------------------------------------
approach1:
----------
iterate the array and for each element loop through the entire array and check whether the sum is matching the given number.
 loop within a loop. complexity is O(n2)
 
approach2:
----------
iterate through the array put the elements in a Set. 
while iterating through the array  check if (searchedvalue-currentvalue) present in the set using contains() method.
if not present put in the set.If present then print both.

in this approach the complexity to iterate n elements will O(n).
the complexity for adding and checking whether it is present is O(1).
in this approach the space complexity becomes O(n) as we are using additional Set for storing the array elements.

approach3:
---------
sort the array and use two pointers to scan through array from both direction i.e. beginning and end. 
If sum of both the values are equal to given number then we output the pair and advance them.

Copy an array
---------------
Simply assigning reference is wrong
Array can be copied by iterating over array, and one by one assigning elements.
We can avoid iteration over elements using clone() or System.arraycopy()
clone() creates a new array of same size, but System.arraycopy() can be used to copy from a source range to a destination range.
System.arraycopy() is faster than clone() as it uses Java Native Interface

Total Sub Array of an array
--------------------------
 vector of N elements the total number of subarrays is N*(N+1)/2
 
 
 
Removing an duplicate element from an array
----------------------------------------------
its not difficult to find duplicate element , its difficult to remove duplicates as arrays of fixed length and there is no api to remove element.

1) easiest approach put all in a Set implementation ex LinkedHashSet where order will be preserved
2)Replace the duplicate with some special characters or numbers. for this approach you have to sort the array
3)create a new array and for duplicate check use a Set 


Quick sort algorithm
---------------------
1)Quicksort algorithm is most efficient sorting algorithm
2)This is in-place sorting algorithm
3)best case O(nlogn) worst-case O(n2)
4)Arrays.sort() uses Quicksort

steps for quicksort
--------------------
Choose a pivot value (in this case, choose the value of the middle element)
Initialize left and right pointers at extremes.
Starting at the left pointer and moving to the right, find the first element which is greater than or equal to the pivot value.
Similarly, starting at the right pointer and moving to the left, find the first element, which is smaller than pivot value
Swap elements found in 3 and 4.
Repeat 3,4,5 until left pointer is greater or equal to right pointer.
Repeat the whole thing for the two subarray to the left and the right of the left pointer.

while moving the pointer i it will cross the pivot and similarly while moving the pointer j the it can cross the pivot

next time while calling the pivot quick-sort algo we have to call for  0 to j and i to n

where the real order will be 0 j p i n   . p is already sorted placed at its right position.

one complete quick-sort method call the only one element gets placed correctly.



Mid Index of an array
---------------------
mid = start + (end - start)/2


 
 



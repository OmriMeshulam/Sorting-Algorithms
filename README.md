# Sorting-Algorithms
Includes counting sort O(n+k), Radix LSD sort O(nk), Merge Sort O(n log n), Bubble sort O(n^2)

About counting sort: No negative values allowed, must know highest and lowest values.
Counting sort (sometimes referred to as ultra sort or math sort) is a sorting algorithm which (like bucket sort) takes advantage of knowing the range of the numbers in the array to be sorted (array A).
Counting sort is a stable sort and has a running time of Θ(n+k), where n and k are the lengths of the arrays A (the input array) and C (the counting array), respectively. In order for this algorithm to be efficient, k must not be much larger than n.

About Radix LSD sort: Current implementation does not allow negative numbers. A least significant digit radix sort operates in O(nk) time, where n is the number of keys, and k is the average key length.

About Merge sort:  is an O(n log n) comparison-based sorting algorithm. Divide and conquer algorithm. Conceptually, a merge sort works as follows: Divide the unsorted list into n sublists, each containing 1 element (a list of 1 element is considered sorted). Repeatedly merge sublists to produce new sorted sublists until there is only 1 sublist remaining. This will be the sorted list.

About Bubble sort: O(n^2). Comparison based sorting algorithm that repeatedly steps through the list to be sorted, compares each pair of adjacent items and swaps them if they are in the wrong order.
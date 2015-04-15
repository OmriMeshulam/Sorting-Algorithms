# Sorting-Algorithms
Includes counting sort O(n+k), Radix LSD sort O(nk)

About counting sort: No negative values allowed, must know highest and lowest values.
Counting sort (sometimes referred to as ultra sort or math sort) is a sorting algorithm which (like bucket sort) takes advantage of knowing the range of the numbers in the array to be sorted (array A).
Counting sort is a stable sort and has a running time of Θ(n+k), where n and k are the lengths of the arrays A (the input array) and C (the counting array), respectively. In order for this algorithm to be efficient, k must not be much larger than n.

About Radix LSD sort: Current implementation does not allow negative numbers. An LSD radix sort operates in O(nk) time, where n is the number of keys, and k is the average key length.
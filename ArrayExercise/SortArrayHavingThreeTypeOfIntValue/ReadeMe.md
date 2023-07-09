# Question: 
Array consist of only 0's, 1's and 2's.
Write an algorithm to sort  this array in O(n) time complexity and O(1) Space complexity
with only one traversal.

# Answer:
 Two ways to sort.
 Easiest ,using counter sort
 Logical, use of mid,low, and high, and swapping
 (All 0's in lower half; 1's in middle half; 2's in higher end)

 # Question:
 Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements in O(n) Time complexity and O(1) Space complexity with single traversal allowed

 # Answer

 Track start and end position of array
 and swap then number if start pos doesn't have zero with the end pos where number is zero
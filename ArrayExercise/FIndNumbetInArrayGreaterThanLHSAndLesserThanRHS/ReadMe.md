# Question:
We have an array, we have to find an element before which all elements are less than it, and after which all are greater than it. 
Finally, return the index of the element, if there is no such element, then return -1: Time complexity O(n) and Space Complexity O(n)

# example:

1. 4,2,3,5,7,9,11,8,10 => o/p =5
2.  6,2,5,4,7,9,11,8,10 => o/p=7

# Answer

Starting from right, find the LeastNumberOnRHS that should be greater than currentNumber
and starting from left, find the greatestNumberOnRHS that should be lesser than currentNumber
if both is satisfied, keep find the least number which satisfy both condition

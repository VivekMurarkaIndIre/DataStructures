# Question
Given an array of integer, write an efficient algorithm to find majority number in that array in Time Complexity O(n) and Space Complexity O(1)

# Answer

we know that a number to be majortiy number it's frequency in an array should be more than half the size of array.
Using this we can assign firt element as majortiy number and count 1
now we iterate over array.
whenever we encouter the number equal to choosen majority number we increase the count
and if number is different than we decrease the count

if count becomes zero then we assign current number as majority number
and increase the count.

At the end of iteration if count is more than zero then we have a majority number else we don't have any number which occured more than half the array length.
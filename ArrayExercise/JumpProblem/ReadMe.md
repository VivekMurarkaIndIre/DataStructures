# Question 

You have an array of non-negative integers,you are initially positioned at the first index of the array.Each element in the array represents your maximum jump length at that position.Determine if you are able to reach the last index in O(n) Time complexity and O(1) Space Complexity Asked in 

# Answer

start with zero position, the value at zer pos is crrent max. number of steps I can take
keep track of vales which are higher than current max number of step
keep reducing each step taken after every iteration
when current max step is zero, take a jump with max tracked value
if both vales are zero, jump not possible
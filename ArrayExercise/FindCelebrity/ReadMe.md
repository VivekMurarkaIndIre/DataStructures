# Question

You are in a party of N people, where only one person is known to everyone. Such a person may be present at the party, if yes, (s)he doesn’t know anyone at the party. Your task is to find the celebrity at the party in Time Complexity O(n) 

Mean: Celebrity is aperson who is know to everyone but celebrtiy doesn't know anyone

# Solution

if matric is 4*4 
wher cell on row X and column Y marked 1, mean X knows Y
and marked 0 , mean X doesn't know Y

So starting from last coumne as Y=4 and X=0
 if this cell is 0 means X doesn't know Y, that also implies Y can't be celebrity hence decrease Y by 1
 if the cell was 1 means X knows Y, that means X can't be celebrity but Y can be or cannot be

 We continue this process untill X is less than Y
 whatever value is left of X we check if all the value in that column is 0 if yes then X is celebrity
 else return -1
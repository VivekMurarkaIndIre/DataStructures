# Problem

Write an algorithm to find out next greater number to given number with the same set of digits.

# Example

218765 => 251678

12345 => 12354

# Logic

1. Starting from right, working with two adjacent pair, find the first pair, where LHS is smaller than the RHS
eg:  in 218765 => 1 is less than 8
2. then take this numer and swap it with the number from remaining right numbers, of which is immediate higher than this number
so in 218765 => we swap 1 with 258761
3. Then sort all the number in right from this position
so in 218765 => we got 258761 => now sort after 25 => we get  => 251678
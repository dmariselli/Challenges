# Problem Statement

You are given an integer N. Find the digits in this number that exactly divide N(division that leaves 0 as remainder) and display their count. For N=24, there are 2 digits - 2 & 4. Both of these digits exactly divide 24. So our answer is 2.

# Note

* If the same number is repeated twice at different positions, it should be counted twice, e.g., For N=122, 2 divides 122 exactly and occurs at ones' and tens' position. So for this case, our answer is 3.
* Division by 0 is undefined.

# Input Format

The first line contains T (number of test cases) followed by T lines (each containing an integer N).

# Constraints 
1<=T<=15 
0<N<10^10

# Output Format

For each test case, display the count of digits in N that exactly divide N in a separate line.
# [Balanced Brackets](https://www.hackerrank.com/challenges/balanced-brackets/problem)

## Sample Input

STDIN           Function
-----           --------
3               n = 3
{[()]}          first s = '{[()]}'
{[(])}          second s = '{[(])}'
{{[[(())]]}}    third s ='{{[[(())]]}}'

## Sample Output

YES
NO
YES

## Explanation

1. The string **{[()]}** meets both criteria for being a balanced string.
2. The string **{[(])}** is not balanced because the brackets enclosed by the matched pair **{** and **}** are not balanced: **[(])**.
3. The string **{{[[(())]]}}** meets both criteria for being a balanced string.

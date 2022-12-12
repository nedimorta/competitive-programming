# [Contacts](https://www.hackerrank.com/challenges/contacts/problem)

## Sample Input

`STDIN           Function`
`-----           --------`
`4               queries[] size n = 4`
`add hack        queries = ['add hack', 'add hackerrank', 'find hac', 'find hak']`
`add hackerrank`
`find hac`
`find hak`

## Sample Output 

`2`
`0`

## Explanation 

1. Add a contact named "**hack**".
2. Add a contact named "**hackerrank**".
3. Find the number of contact names beginning with hac. Both name start with "**hac**", add "**2**" to the return array.
4. Find the number of contact names beginning with hak. neither name starts with "**hak**", add "**0**" to the return array.

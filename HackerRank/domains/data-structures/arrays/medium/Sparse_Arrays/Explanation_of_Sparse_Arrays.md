## Solution Explanation
This solution employs a HashMap for efficient frequency counting and retrieval, providing an optimized approach for finding string occurrences.

### HashMap for Frequency Counting
A HashMap (`solMap`) is used to store each unique string from `stringList` as a key, with its frequency as the value. This structure allows for O(1) average time complexity for both insertion and lookup operations, making the solution efficient for large datasets.

### Implementation Details
1. **Populating the HashMap**: 
   - Iterate through each string in `stringList`.
   - If a string is already in `solMap`, increment its count. Otherwise, add it to the map with a count of 1.

2. **Processing Queries**:
   - For each query string, use `getOrDefault` method to fetch the frequency from `solMap`. If the query string is not present in the map, return 0.
   - Store each frequency in an ArrayList (`resultArray`).

3. **Returning the Result**:
   - The `matchingStrings` method returns `resultArray`, which contains the frequencies of each query string in the order they appear in `queries`.

## Example

Input:

`4`\
`aba`\
`baba`\
`aba`\
`xzxb`\
`3`\
`aba`\
`xzxb`\
`ab`

Output:

`2`\
`1`\
`0`

Explanation:
- "aba" appears 2 times in the string list.
- "xzxb" appears 1 time.
- "ab" does not appear in the string list.

## Conclusion
This Java code provides a simple yet effective solution for counting occurrences of strings. It demonstrates the efficient use of HashMaps for frequency counting and highlights the importance of choosing the right data structure for optimizing performance in large datasets.

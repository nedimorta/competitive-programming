/*class Result
{

    private static readonly string ADD = "add";
        private static readonly string FIND = "find";

        public static List<int> contacts(List<List<string>> queries)
        {
            List<int> result = new List<int>();
            Trie trie = new Trie();

            foreach (List<string> query in queries)
            {
                if (query[0] == ADD)
                {
                    trie.AddNewWord(query[1]);
                }
                else if (query[0] == FIND)
                {
                    result.Add(trie.FindWordCount(query[1]));
                }
            }

            return result;
        }

        class Trie
        {
            private List<TrieNode> roots;

            public Trie()
            {
                roots = new List<TrieNode>();
            }

            public void AddNewWord(string word)
            {
                TrieNode rootNode = roots.Find(x => x.Character == word[0]);

                if (rootNode == default(TrieNode))
                {
                    rootNode = new TrieNode();
                    rootNode.Character = word[0];
                    roots.Add(rootNode);
                }

                rootNode.WordCount++;

                for (int i = 1; i < word.Length; i++)
                {
                    rootNode = rootNode.AddNode(word[i]);
                }
            }

            public int FindWordCount(string word)
            {
                TrieNode rootNode = roots.Find(x => x.Character == word[0]);

                if (rootNode == default(TrieNode))
                {
                    return 0;
                }

                for (int i = 1; i < word.Length; i++)
                {
                    rootNode = rootNode.GetNode(word[i]);

                    if (rootNode == default(TrieNode))
                    {
                        return 0;
                    }
                }

                return rootNode.WordCount;
            }

            private class TrieNode
            {
                public char Character;
                public int WordCount;
                public List<TrieNode> ChildNodes;

                public TrieNode()
                {
                    ChildNodes = new List<TrieNode>();
                    WordCount = 0;
                }

                public TrieNode GetNode(char ch)
                {
                    return ChildNodes.Find(x => x.Character == ch);
                }

                public TrieNode AddNode(char ch)
                {
                    var nextNode = ChildNodes.Find(x => x.Character == ch);

                    if (nextNode != default(TrieNode))
                    {
                        nextNode.WordCount++;
                        return nextNode;
                    }
                    else
                    {
                        TrieNode node = new TrieNode();
                        node.Character = ch;
                        node.WordCount++;
                        ChildNodes.Add(node);

                        return node;
                    }
                }
            }
        }
}*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'contacts' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts 2D_STRING_ARRAY queries as parameter.
     */

    public static List<Integer> contacts(List<List<String>> queries) {
    // Write your code here

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int queriesRows = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<String>> queries = new ArrayList<>();

        for (int i = 0; i < queriesRows; i++) {
            queries.add(Arrays.asList(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")));
        }

        List<Integer> result = Result.contacts(queries);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

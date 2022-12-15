import java.io.*;
import java.util.*;


class Result {

    /*
     * Complete the 'isBalanced' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String isBalanced(String s) {
    Stack<Character> stack = new Stack<>();

    for (char ch : s.toCharArray()) {
        if (ch == '{' || ch == '(' || ch == '[') {
            stack.push(ch);
        } else {
            if (stack.isEmpty()) {
                return "NO";
            }

            char b = stack.pop();

            if ((b == '{' && ch != '}') || (b == '[' && ch != ']') || (b == '(' && ch != ')')) {
                return "NO";
            }
        }
    }

    if (stack.isEmpty()) {
        return "YES";
    } else {
        return "NO";
    }
}

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            String s = bufferedReader.readLine();

            String result = Result.isBalanced(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}



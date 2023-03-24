import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the sherlockAndAnagrams function below.
    static int sherlockAndAnagrams(String s) {
        int result = 0;
        
        for(int counter = s.length(); counter >= 1; counter--) {
            
            for(int i = 0; i + counter <= s.length(); i++) {
                
                String firstSubString = s.substring(i, i + counter);
                
                char[] firstSubStrArray = firstSubString.toCharArray();
                Arrays.sort(firstSubStrArray);
                String str1 = String.valueOf(firstSubStrArray);
                
                for(int j = i + 1; j + counter <= s.length(); j++) {
                    String secondSubString = s.substring(j, j + counter);
                    
                    char[] secondSubStrArray = secondSubString.toCharArray();
                    Arrays.sort(secondSubStrArray);
                    String str2 = String.valueOf(secondSubStrArray);
                    
                    if(str1.equals(str2)) {
                        result++;
                    }
                }
            }
            
        }

        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = sherlockAndAnagrams(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}

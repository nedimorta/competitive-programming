import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'minimumBribes' function below.
     *
     * The function accepts INTEGER_ARRAY q as parameter.
     */

    public static void minimumBribes(List<Integer> q) {
    int result = 0;

    for (int i = q.size() - 2; i >= 0; i--) {
        int localCount = 0;
        int j = i;

        while (j < q.size() - 1 && q.get(j) > q.get(j + 1)) {
            int temp = q.get(j + 1);
            q.set(j + 1, q.get(j));
            q.set(j, temp);
            localCount++;
            j++;
        }

        if (localCount > 2) {
            System.out.println("Too chaotic");
            return;
        } else {
            result += localCount;
        }
    }

    System.out.println(result);

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<Integer> q = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

                Result.minimumBribes(q);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}

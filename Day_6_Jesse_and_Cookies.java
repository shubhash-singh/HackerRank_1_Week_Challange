import static java.util.stream.Collectors.*;

import java.io.IOException;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.stream.Stream;

class Result {
    
}

public class Day_6_Jesse_and_Cookies {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String[] firstMultipleInput = sc.nextLine().replaceAll("\\s+$", "").split(" ");

        // int n = Integer.parseInt(firstMultipleInput[0]);
        // no need to get input for number of elements
        
        int k = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> A = Stream.of(sc.nextLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = cookies(k, A);

        System.out.println(String.valueOf(result));
        sc.close();
    }

    public static int cookies(int k, List<Integer> arr) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(arr);
        int result = 0;
        
        while (minHeap.size() > 1 && minHeap.peek() < k) {
            Integer leastSweet1 = minHeap.poll();
            Integer leastSweet2 = minHeap.poll();
            if (leastSweet1 != null && leastSweet2 != null) {
                int newCookie = leastSweet1 + 2 * leastSweet2;
                minHeap.add(newCookie);
                result++;
            } else {
                // Handle unexpected case
                return -1;
            }
        }
        return (minHeap.peek() >= k) ? result : -1;
    }
}
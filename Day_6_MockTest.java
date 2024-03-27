import static java.util.stream.Collectors.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.IntStream;
import java.util.stream.Stream;



class Result {


    
    public static List<Integer> bfs(int n, int m, List<List<Integer>> edges, int s) {
        if (n < 1 || edges == null || edges.size() < 1 || s < 1) return null;

        // Create an adjacency list to represent the graph
        List<List<Integer>> adjacencyList = new ArrayList<>(n + 1);
        for (int i = 0; i <= n; i++) {
            adjacencyList.add(new ArrayList<Integer>());
        }
        for (List<Integer> edge : edges) {
            int a = edge.get(0);
            int b = edge.get(1);
            adjacencyList.get(a).add(b);
            adjacencyList.get(b).add(a); // Graph is undirected
        }

        List<Integer> distances = new ArrayList<>(Collections.nCopies(n + 1, -1));
        distances.set(s, 0); // Distance to starting node is 0

        // Perform BFS
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(s);
        while (!queue.isEmpty()) {
            int current = queue.poll();
            for (int neighbor : adjacencyList.get(current)) {
                if (distances.get(neighbor) == -1) {
                    distances.set(neighbor, distances.get(current) + 6);
                    queue.offer(neighbor);
                }
            }
        }

        // Remove distance to starting node and adjust indices
        distances.remove(0);
        distances.remove(s - 1);

        // Replace -1 with -1 for unreachable nodes
        for (int i = 0; i < distances.size(); i++) {
            if (distances.get(i) == -1) {
                distances.set(i, -1);
            }
        }

        return distances;
    }
}


public class Day_6_MockTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int n = Integer.parseInt(firstMultipleInput[0]);

                int m = Integer.parseInt(firstMultipleInput[1]);

                List<List<Integer>> edges = new ArrayList<>();

                IntStream.range(0, m).forEach(i -> {
                    try {
                        edges.add(
                            Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                        );
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                });

                int s = Integer.parseInt(bufferedReader.readLine().trim());

                List<Integer> result = Result.bfs(n, m, edges, s);

                bufferedWriter.write(
                    result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                    + "\n"
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}

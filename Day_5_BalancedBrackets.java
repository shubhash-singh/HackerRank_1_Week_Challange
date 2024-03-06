import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.stream.IntStream;

class CheckBalanceBracket {


    public static String isBalanced(String s) {
        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        
        for(char c : arr) {
            if( c == '(' || c == '{' || c == '[')
                stack.push(c);
            else if ( c == ')' && !stack.isEmpty() && stack.peek() == '(')
                stack.pop();
            else if ( c == '}' && !stack.isEmpty() && stack.peek() == '{')
                stack.pop();
            else if ( c == ']' && !stack.isEmpty() && stack.peek() == '[')
                stack.pop();
            else
                return "NO";
        }
        return stack.isEmpty() ? "YES" : "NO";
    }

}

public class Day_5_BalancedBrackets {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String s = bufferedReader.readLine();

                String result = CheckBalanceBracket.isBalanced(s);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
import java.util.Scanner;
import java.util.Stack;

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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the test number : ");
        int n = Integer.parseInt(sc.nextLine());

        while(n-->0) {
            String s = sc.nextLine();
            System.out.println(CheckBalanceBracket.isBalanced(s));
        }
        sc.close();
    }
}
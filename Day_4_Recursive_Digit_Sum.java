import java.util.Scanner;

public class Day_4_Recursive_Digit_Sum {

    static void superDigit(String x)
    {
        int sum = 0;
        
        if (sum<10)
        {
            System.out.println(sum);
        }
        else
        {
            superDigit(String.valueOf(sum));
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int k = sc.nextInt();
        // StringBuilder value = new StringBuilder();
        String value = "";
        while(k-->0)
        {
            value += n;
        }
        superDigit(value);
        sc.close();
    }
}

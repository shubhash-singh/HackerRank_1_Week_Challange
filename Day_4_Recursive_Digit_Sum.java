import java.util.Scanner;

public class Day_4_Recursive_Digit_Sum {

    static void superDigit(String inpuString)
    {
        int sum = 0;
        for (int i=0;i<inpuString.length();i++)
        {
            int digit = Character.getNumericValue(inpuString.charAt(i));
            sum += digit; 
        }
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
        String[] arr = sc.nextLine().split(" ");
        String n = arr[0];
        int k = Integer.parseInt(arr[1]);
        long initialSum = 0;
        
        for (int i=0;i<n.length();i++)
        {
            int digit = Character.getNumericValue(n.charAt(i));
            initialSum += digit;
        }
        initialSum = initialSum*k;
        String value = String.valueOf(initialSum);
        superDigit(value);
        sc.close();
    }
}

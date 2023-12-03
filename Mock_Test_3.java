import java.util.Scanner;

public class Mock_Test_3 {

    // To reverse a string
    public static String REVERSE(String Str)
    {
        StringBuilder s = new StringBuilder(Str).reverse();
        return (s.toString());
    }

    // To chack whether a string is palindrome or not
    public static boolean isPalindrome(String s)
    {
        if (s.equals(REVERSE(s)))
            return true;
        else
            return false;
        
    }

    static int palindromeIndex(String str)
    {
        int n = str.length() -1;
        if (!isPalindrome(str))
        {
            for (int i=0;i<=(n/2);i++)
            {
                // System.out.println("Executed");
                if (str.charAt(i) != str.charAt(n-i))
                {
                    String NoI = str.substring(0,i) + str.substring(i+1);
                    String withoutSymmetricI = str.substring(0,n-i) + str.substring(n-i+1);
                    if (isPalindrome(NoI))
                    {
                        return i;
                    }
                    // String 
                    else if (isPalindrome(withoutSymmetricI))
                    {
                        return n-i+1;
                    }
                    else
                    {
                        return -1;
                    }      
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of test case");
        int tc = sc.nextInt();

        while(tc-->0)
        {
            System.out.println("Enter the String: ");
            String str = sc.next();
            System.out.println(palindromeIndex(str));

            
            
        }
        sc.close();
    }
}

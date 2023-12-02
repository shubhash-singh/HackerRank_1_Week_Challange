import java.util.Scanner;

class Day3_Tower_Breaker {
    public static int Winner(int height, int no)
    {
        if (no == 1 || height%2 == 0)
            return 2;
        else;
            return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while( t-- >0)
        {
            int height = sc.nextInt();
            int no = sc.nextInt();
            System.out.println(Winner(height, no));
        }
        sc.close();
    }
} 
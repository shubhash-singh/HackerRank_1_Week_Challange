import java.util.Scanner;

public class Day_4_New_Year_Chaos {

    static void YearChaos(int[] array)
    {
        int n = array.length;
        int bribe = 0;
        for (int i=n-1;i>=0;i--)
        {
            if (array[i] -(i+1) >2)
            {
                System.out.println("Too chaotic");
                return;
            }
            for (int j=Math.max(0, array[i]-2);j<i;j++)
                if (array[i] < array[j])
                    bribe ++;
        }
        System.out.println(bribe);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0)
        {
            int n = sc.nextInt();
            int[] array = new int[n];
            for(int i=0;i<n;array[i++]= sc.nextInt());
            YearChaos(array);
        }
        sc.close();
    }
}

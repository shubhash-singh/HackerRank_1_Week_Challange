import java.util.Scanner;

class Day_4_Grid_Challange {

    static boolean isInOrder(String str)
    {
        // boolean result = true;
        // int i=0;
        // System.out.println("\n\n" + str);
        for(int i=0;i<str.length()-1;i++)
        {
            int a = (int) str.charAt(i);
            int b = (int)str.charAt(i+1);
            // int c = (int) str.charAt(str.cha)
            // System.out.println(a+" "+b);
            if (a>=b)
                return false;
        // System.out.println(result);
        }
        return true;
    }
    public static boolean isGrid(String[] Grid)
    {
        int array_len = Grid.length;
        int elem_len = Grid[0].length();
        boolean result = false;
        for (int i =0;i<elem_len;i++)
        {
            String str = "";
            for (int j=0;j<array_len;j++)
            {
                str += Grid[j].charAt(i);
            }
            // System.out.println(str);
            if (isInOrder(str))
            {
                result = true;
            }
            else{
                result = false;
            }

        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        while(tc-->0)
        {
            int n = sc.nextInt();
            String[] array = new String[n];
            for (int i =0;i<n;array[i++]=sc.next());
            
            // isGrid(array);n
            if(isGrid(array))
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
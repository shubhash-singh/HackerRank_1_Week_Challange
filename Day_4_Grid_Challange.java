import java.io.*;
import java.util.*;

public class Day_4_Grid_Challange {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.next());
        while(t-->0){
            int n = sc.nextInt();
            String[]grid = new String[n];
            for(int i=0;i<n;i++)
                grid[i] = sort(sc.next());
            
            boolean ok = true;
            int elem_len = grid[0].length();
            for(int i=0;i<elem_len;i++){
                for(int j=1;j<n;j++){
                    if(grid[j].charAt(i) < grid[j-1].charAt(i)){
                        ok = false;
                        break;
                    }
                }
            }
            System.out.println(ok?"YES":"NO");
            
            
        }
        sc.close();
    }
    public static String sort(String s){
        char[] array = s.toCharArray();
        Arrays.sort(array);
        return new String(array);
    }
}
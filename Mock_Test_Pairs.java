import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Mock_Test_Pairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of operations: ");
        int n = sc.nextInt();
        System.out.println(n);
        int k = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        arr = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        System.out.println(CalculateResult.pairs(k, arr));
        sc.close();
    }
}
class CalculateResult {
    /*
    * Complete the 'pairs' function below.
    *
    * The function is expected to return an INTEGER.
    * The function accepts following parameters:
    * 1. INTEGER k
    * 2. INTEGER_ARRAY arr
    */
    public static int pairs(int k, List<Integer> arr) {
        Collections.sort(arr); // Sort the array
        int n = arr.size();
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr.get(j) - arr.get(i) == k || arr.get(i) - arr.get(j) ==k){
                    count++;
                }
                else if(arr.get(j) - arr.get(i) > k || arr.get(i) - arr.get(j) > k){
                    break;
                }
            }
        }
        return count;
    }
}
/*
 * This is a special interview program which is used to sort an array in such way that:
 * 
 * 1. Middle element must be the largest element
 * 2. Element before mid must be in ascending order
 * 3. Element after mid must be in descending order
 * 
 * Rules:
 * 1. Entered array must be of ODD length 
 * 2. Length of array and element of array are only allowed to take as Input
 * 3. Creating multiple array is not allowed
 */

import java.util.*;

public class Zig_Zag_Sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of test case: ");
        int no_if_test = sc.nextInt();
        while(no_if_test-->0)
        {
            System.out.println("Enter the Length of array \nMost be odd number: ");
            int arrayLength = sc.nextInt();
            System.out.println("Enter the element of array:  ");
            int[] IntArray = new int[arrayLength];
            for(int i=0;i<arrayLength;IntArray[i++]=sc.nextInt());
            if (arrayLength % 2 == 0)
                System.out.println("PLease enter array of odd length:");
            else
            {   
                Arrays.sort(IntArray);
                int mid = arrayLength/2;
                
                // System.out.println(mid);

                int temp = IntArray[mid];
                IntArray[mid] = IntArray[arrayLength-1] ;
                IntArray[arrayLength-1] = temp;
                
                int start = mid+1;
                int end = arrayLength -2;

                while (start <= end)
                {
                    temp = IntArray[start];
                    IntArray[start] = IntArray[end];
                    IntArray[end] = temp;
                    start ++;
                    end --;
                }

                for (int i=0;i<arrayLength;i++)
                    System.out.print(IntArray[i]+" ");
            }
        }
        sc.close();
    }    
}
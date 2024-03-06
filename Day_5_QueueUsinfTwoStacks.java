import java.util.ArrayList;
import java.util.Scanner;

public class Day_5_QueueUsinfTwoStacks {
    static ArrayList<Integer> arr = new ArrayList<>();
    public static void enQueue(int data) {
        arr.add(data);
    }
    
    static void deQueue() {
        arr.remove(0);
    }
    
    static void printData() {
        System.out.println(arr.get(0));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while(q-->0) {
            int choice = sc.nextInt();
            switch(choice) {
                case 1 : 
                    int data = sc.nextInt();
                    enQueue(data); break;
                case 2 : deQueue(); break;
                case 3 : printData(); break;
            }
        }
        sc.close();
    }
}
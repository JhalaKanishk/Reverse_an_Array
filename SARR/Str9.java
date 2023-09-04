import java.util.Scanner;

public class Str9 {
    static void toprint(int arr[],int n){
        for (int i = 0; i <= n - 1; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    static int tofind(int a[],int n){
        int x1 = a[0];
        int x2 = 1;
        // For xor of all the elements in array
        for (int i = 1; i <= n - 1; i++)
            x1 = x1 ^ a[i];
        // For xor of all the elements from 1 to n+1
        for (int i = 2; i <= n + 1; i++)
            x2 = x2 ^ i;

        return (x1 ^ x2);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size :");
        int n = sc.nextInt();
        System.out.println("Enter Array Elements :");
        int arr[] = new int[n];
        //input
        for (int i = 0; i <= n - 1; i++) {
            arr[i] = sc.nextInt();
        }
        //output
        System.out.println("Resultant Array :");
        toprint(arr,n);
        System.out.println("\nMISSING ELEMENT IS : "+tofind(arr, n));

    }
}

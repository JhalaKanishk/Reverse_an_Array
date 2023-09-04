import java.util.*;
public class Str3 {
    public static int isSorted(int arr[],int n){
        // Write your code here.
        for (int i=1;i<=n-1;i++){
            if (arr[i] >= arr[i-1]){

            }
            else {
                return 0;//false
            }
        }
        return 1;//true
    }
    static void toPrint(int arr[],int n){
        for (int i=0;i<=n-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size :");
        int n = sc.nextInt();
        System.out.println("Enter Array Elements :");
        int arr[] = new int[n];
        //input
        for (int i=0;i<=n-1;i++){
            arr[i] = sc.nextInt();
        }
        //output
        System.out.println("Resultant Array :");
        toPrint(arr,n);

        System.out.println();

        System.out.println("Array is Sorted 0(NO) & 1(YES) :"+isSorted(arr,n));

    }
}
import java.util.*;

public class Str6 {
    static void reverse(int arr[],int start,int end){
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    static void LeftRotate(int arr[], int n,int k) {
        k %= n;//k larger then n take modulo
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);
    }
    static void RightRotate(int arr[],int n,int k){
        k %= n;//k larger then n take modulo
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
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

//        System.out.println();
//        System.out.println("Reversed Array :");
//        reverse(arr,0,n-1);
//        toPrint(arr,n);
//        System.out.println();

        System.out.println();
        System.out.println("Enter the Place you want Rotate by :");
        int k = sc.nextInt();

        System.out.println("Left Rotated Array By K Places :");
        LeftRotate(arr,n,k);
        toPrint(arr,n);
        System.out.println();
        System.out.println("Right Rotated Array By K Places :");
        RightRotate(arr,n,k);
        toPrint(arr,n);

    }
}
//import java.util.*;
//
//public class Str6 {
//    static void subarray(int arr[],int n){
//        for (int i=0;i<=n-1;i++){
//            for (int j=i;j<=n-1;j++){//j starts with i
//                for (int k=i;k<=j;k++){
//                    System.out.print(arr[k]+" ");
//                }
//                System.out.println();
//            }
//            System.out.println();
//        }
//    }
//    static void toprint(int arr[],int n){
//        for (int i=0;i<=n-1;i++){
//            System.out.print(arr[i]+" ");
//        }
//    }
//    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Array Size :");
//        int n = sc.nextInt();
//        System.out.println("Enter Array Elements :");
//        int arr[] = new int[n];
//        //input
//        for (int i = 0; i <= n - 1; i++) {
//            arr[i] = sc.nextInt();
//        }
//        //output
//        System.out.println("Resultant Array :");
//        toprint(arr, n);
//        System.out.println();
//        System.out.println("SUB-ARRAYS as FOLLOWS:");
//        subarray(arr,n);
//    }
//}

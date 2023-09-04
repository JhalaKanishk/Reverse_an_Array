import java.util.*;

public class Str4 {
    static boolean check(int arr[],int n){
        int i,count = 0;
        //To Check Sorted
        for (i=1;i<=n-1;i++){
            if (arr[i] >= arr[i-1]){

            }
            else {
                count++;
            }
        }
        //To Check Rotated
        if (arr[n-1] > arr[0]){
            count++;
        }
        return count<=1;//true {0 or 1}
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
        toPrint(arr,n);

        System.out.println();

        System.out.println("To Check if Array is Sorted & Rotated : "+check(arr,n));

    }
}
//import java.util.Scanner;
///*
//    Example:
//
//        Input: nums = [3,4,5,1,2]
//        Output: true
//        Explanation: [1,2,3,4,5] is the original sorted array.
//        You can rotate the array by x = 3 positions to begin on the the element of value 3: [3,4,5,1,2].
//*/
//public class Str4 {
//    static boolean tocheck(int arr[],int n){
//       int i;
//       int count = 0;
//       //sorted
//       for (i=1;i<=n-1;i++){
//           if (arr[i] >= arr[i-1]){
//
//           }
//           else {
//               count++;
//           }
//       }
//       //rotated
//       if (arr[n-1] > arr[0]){
//           count++;
//       }
//       return count<=1;
//    }
//
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
//        for (int i=0;i<=n-1;i++){
//            arr[i] = sc.nextInt();
//        }
//        //output
//        System.out.println("Resultant Array :");
//        toprint(arr,n);
//        System.out.println();
//
//        System.out.println("Check if Array Is Sorted and Rotated : "+tocheck(arr,n));
//    }
//}

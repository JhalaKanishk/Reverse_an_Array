import java.util.*;
public class Str2 {
    static int tofindSecondSmallest(int arr[],int n){
        int fSmallest = Integer.MAX_VALUE;
        int sSmallest = Integer.MAX_VALUE;
        for (int i=0;i<=n-1;i++){
           if (arr[i] < fSmallest){
               sSmallest = fSmallest;
               fSmallest = arr[i];
           } else if (arr[i] != fSmallest && arr[i] < sSmallest) {
               sSmallest = arr[i];
           }
        }
        return sSmallest;
    }
    static int tofindSecondLargest(int arr[],int n){
        int fLargest = Integer.MIN_VALUE;
        int sLargest = Integer.MIN_VALUE;
        for (int i=0;i<=n-1;i++){
            if (arr[i] > fLargest){
                sLargest = fLargest;
                fLargest = arr[i];
            } else if (fLargest != arr[i] && sLargest > arr[i]) {
                sLargest = arr[i];
            }
        }
        return sLargest;
    }
    static int[] toGetSecondElements(int arr[],int n){
        int sL = tofindSecondLargest(arr,n);
        int sS = tofindSecondSmallest(arr,n);
        int result[] = {sL,sS};
        return result;
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

//        System.out.println(tofindSecondLargest(arr,n));
//        System.out.println(tofindSecondSmallest(arr,n));

        System.out.print("Second Largest & Second Smallest are :");
        int result[] = toGetSecondElements(arr,n);
        for (int i=0;i<=result.length-1;i++){
            System.out.print(result[i]+" ");
        }
    }
}



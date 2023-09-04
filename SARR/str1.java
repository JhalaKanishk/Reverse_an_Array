import java.util.*;
public class str1 {
    static int tofindMin(int arr[],int n){
        int Min = Integer.MAX_VALUE;
        for (int i=0;i<=n-1;i++){
            if (arr[i] < Min){
                Min = arr[i];
            }
        }
        return Min;
    }
    static int tofindMax(int arr[],int n){
        int Max = Integer.MIN_VALUE;
        for (int i=0;i<=n-1;i++){
            if (arr[i] > Max){
                Max = arr[i];
            }
        }
        return Max;
    }
    static void toPrint(int arr[]){
        for (int i=0;i<=arr.length-1;i++){
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
        toPrint(arr);

        System.out.println();

        System.out.println("Maximum Element is : "+tofindMax(arr,n));
        System.out.println("Minimum Elements is : "+tofindMin(arr,n));
    }
}
import java.util.Scanner;

public class Str5 {
    static int removedup(int arr[],int n){
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[j-1]) {
                i++;//i+1
                arr[i] = arr[j];
            }
        }
        return i + 1;//size will be one more
    }
    static void toprint(int arr[],int n){
        for (int i=0;i<=n-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]) {
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
        toprint(arr, n);

        int k = removedup(arr,n);//take size in other variable
        System.out.println("\nUNIQUE ELEMENTS : "+k);
        toprint(arr,k);
    }
}
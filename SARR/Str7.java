import java.util.Scanner;

public class Str7 {
    static int tofindsingle(int arr[],int n){
        int res = arr[0];
        for (int i=1;i<=n-1;i++){
            res = res ^ arr[i];
        }
        return res;
    }
    static void toprint(int arr[],int n){
        for (int i = 0; i <= n - 1; i++) {
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
        System.out.println("ELEMENT OCCURRING ONCE : "+tofindsingle(arr,n));
    }
}

import java.util.Scanner;

public class Str10 {
    static int maxSubArraySum(int a[])
    {
        int size = a.length;
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a[i];
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }
    static void toprint(int arr[],int n){
        for (int i = 0; i <= n - 1; i++) {
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
        for (int i = 0; i <= n - 1; i++) {
            arr[i] = sc.nextInt();
        }
        //output
        System.out.println("Resultant Array :");
        toprint(arr,n);

        System.out.println(maxSubArraySum(arr));
    }
}

import java.util.Scanner;

public class Str8 {
    static int MaxSubarrayProduct(int arr[],int n){
        int l = arr[0], r = arr[0], ans = arr[0];
        for (int i=1;i<=n-1;i++){
            if (arr[i]<0){
                int temp = l;
                l = r;
                r = temp;
            }
            l = Math.max(arr[i],l*arr[i]);
        }
        return ans;
    }
    static int MaxSubarraySum(int arr[],int n){
        int maxSum = 0;
        int currSum = 0;
        for (int i=0;i<=n-1;i++){
            int sum = currSum+arr[i];
            currSum = Math.max(sum,arr[i]);
            maxSum = Math.max(maxSum,currSum);
        }
        return maxSum;
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
        toprint(arr, n);

        System.out.println("Maximum SubArray Sum is : "+MaxSubarraySum(arr,n));
        System.out.println("Maximum SubArray Sum is : "+MaxSubarrayProduct(arr,n));
    }
}

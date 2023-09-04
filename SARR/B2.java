import java.util.Scanner;
//SUB-ARRAYS OF ARRAY
public class B2 {

    static int MaxSumUpto(int arr[],int n,int k){
        int max_sum = 0;
        for (int i=0;i+k<=n;i++) {
            int temp = 0;
            for (int j=i;j<i+k;j++) {
                temp = temp + arr[j];
            }
            max_sum = Math.max(temp,max_sum);
        }
        return max_sum;
    }
    static int MaxSum(int arr[],int n){
        int MaxSum = Integer.MIN_VALUE;
        for (int i=0;i<=n-1;i++){
            for (int j=i;j<=n-1;j++){
                int sum=0;
               for (int k=i;k<=n-1;k++){
                    sum += arr[k];
                    MaxSum = Math.max(MaxSum,sum);
               }
            }
        }
        return MaxSum;
    }
    static void toGenrate(int arr[],int n){
        for (int i=0;i<=n-1;i++){
            for (int j=i;j<=n-1;j++){
                for (int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println("");
            }
        }
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

        System.out.println("\nPossible Sub-Arrays are :");
        toGenrate(arr,n);

        System.out.println("MaxSum is : "+MaxSum(arr,n));

        System.out.println("Enter the value of K");
        int k = sc.nextInt();
        System.out.println("MaxSumUpto : "+MaxSumUpto(arr,n,k));
    }
}

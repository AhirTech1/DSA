import java.util.Scanner;

public class ArraySorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("\nEnter the elements of array one by one :\n");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for (int i=0; i<n; i++){
            for (int j=0; j<n-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.print("\nSorted array : ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

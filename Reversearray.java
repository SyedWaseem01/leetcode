import java.util.*;
public class Reversearray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        reverse(arr,n);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr,int n)
    {
        int st = 0;
        int end = n-1;
        while(st<=end)
        {
            swap(arr,st,end);
            st++;
            end--;
        }
    }
    static void swap(int[] arr,int s,int e){
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }

}

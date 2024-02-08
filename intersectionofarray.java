import java.util.HashSet;

public class intersectionofarray {
    public static void main(String[] args) {
        int arr1[] = {1,2,2,1,4};
        int arr2[] = {2,2,4,5,3,2};
        int[] arr3 =intersection(arr1, arr2);
        for(int ele : arr3)
        {
            System.out.print(ele+" ");
        }
    }
    static int[] intersection(int[] arr1, int[] arr2) {
        HashSet<Integer> a = new HashSet<>();
        HashSet<Integer> b = new HashSet<>();
        for(int ele : arr1)
        {
            a.add(ele);
        }
        for(int i=0;i<arr2.length;i++)
        {
            if(a.contains(arr2[i]))
            {
                b.add(arr2[i]);
            }
        }
        int j=0;
        int[] arr3 = new int[b.size()];
        for(int num : b)
        {
            arr3[j] = num;
            j++;
        }
        return arr3;
        }
}


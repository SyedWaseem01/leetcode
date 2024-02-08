import java.util.*;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a=0;
        int b=1;
        System.out.print(a+","+b+",");
        for(int n=2;n<=num;n++)
        {
            int temp=b;
            b= a+b;
            a=temp;
            System.out.print(b+",");
        }
    }
}

// package Array;
import java.util.*;
public class span {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("enter the elements ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        int max=arr[0];
        int min=arr[0];

        for(int i=1;i<arr.length;i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }

            if(arr[i] < min)
            {
                min = arr[i];
            }
        }

        int span = max-min;
        System.out.println("the span is " + span);

    }
}

import java.io.PrintWriter;
import java.util.Scanner;

public class CyclicalArrayRotation {
    public static void rotate(int[] a, int n){
        int prev = a[0];
        for(int i=1; i<n; i++){
            //insert previous element to current position
            int temp = a[i];
            a[i] = prev;
            prev = temp;
        }
        a[0] = prev;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        rotate(arr, n);
        for(int i = 0; i < n; i++)
            out.print(arr[i]+" ");
        out.flush();
    }
}

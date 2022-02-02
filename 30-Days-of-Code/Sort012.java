import java.io.*;
import java.util.*;

class Sort012 {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0; i<n; i++)
                arr[i] = sc.nextInt();
            //int k =sc.nextInt();
            giveSorted012(arr, n);
            for(int i=0; i<n; i++){
                out.print(arr[i]+" ");
            }
        }
        out.flush();
    }
    public static void giveSorted012(int[] arr, int n){
        int aux[] = new int[3];
        for(int i = 0; i< n; i++){
            aux[arr[i]]++;
        }
        int j=0;
        for(int i=0; i<3; i++){
            while(aux[i] != 0){
                arr[j] = i;
                j++;
                aux[i]--;
            }
        }
    }
}


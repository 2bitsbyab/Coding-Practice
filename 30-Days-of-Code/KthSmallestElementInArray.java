import java.io.*;
import java.util.*;

class KthSmallestElementInArray{

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0; i<n; i++)
                arr[i] = sc.nextInt();
            int k =sc.nextInt();
            out.println(kthSmallest(arr, 0,n-1,k));
        }
        out.flush();
    }

    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        int smallEle = arr[l];
        for(int j = l; j <= r; j++){
            if(arr[j] < smallEle){
                smallEle = arr[j];
            }
        }
        
        while(k > 1){
            int currentSmallEle = 100001;
            for(int i = l ; i <= r; i++){
                if(arr[i] > smallEle && arr[i] < currentSmallEle){
                    currentSmallEle = arr[i];
                }
            }
            smallEle = currentSmallEle;
            k--;
        }
        return smallEle;
        // Arrays.sort(arr);
        // return arr[k-1];
    } 
}
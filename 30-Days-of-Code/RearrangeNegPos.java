import java.io.PrintWriter;
import java.util.Scanner;

public class RearrangeNegPos {
  //rearrange negative and positive numbers on the opposite sides in the array
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
        rearrangeArr(arr, n);
        for(int i=0; i<n; i++){
            out.print(arr[i]+" ");
        }
    }
        out.flush();
    }  
    public static void rearrangeArr(int[] arr, int n){
        //the concept is similar as doing the partition selecting a pivot(here 0) in quick sort
        int j = 0;
        // to start the swapping from the first positive element
        for(int i=0; i<n; i++, j++){
            if(arr[i] >= 0){
                break;
            }     
        }
        for(int i=j+1; i<n; i++){
            if(arr[i] < 0){
                if( i != j){
                    //swap elements at indices i and j
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j++] = temp;
                }
            }
        }
    }
}
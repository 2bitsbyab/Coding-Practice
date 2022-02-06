import java.io.PrintWriter;
import java.util.Scanner;

public class LargestSumSubarray {
    
    private static int solution(int[] arr, int n) {
        int maxSoFar = Integer.MIN_VALUE;
        int positiveSum = 0;

        for(int i=0; i<n; i++){
            positiveSum += arr[i];
            if(maxSoFar < positiveSum)
                maxSoFar = positiveSum;
            if( positiveSum < 0)
                positiveSum = 0;
        }
        return maxSoFar;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        out.print(solution(arr, n));
        
        out.flush();
    }
}

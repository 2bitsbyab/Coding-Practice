import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class DoUnion {
    
// Test case
// 3 7
// 1 2 3
// 3 2 1 6 6 6 5
    private static int doUnion(int[] a, int n, int[] b, int m) {
        Arrays.sort(a);
        Arrays.sort(b);
        int count = 0;
        int i = 0;
        int j = 0;
        while( i< n && j < m){
            // to reduce equal elements
            while(i+1< n && a[i] == a[i+1])
                i++;
            while(j+1<m && b[j] == b[j+1])
                j++;
            if(a[i] < b[j]){
                i++;
            }else if( a[i] > b[j]){
                j++;
            }else{
                i++;
                j++;
            }
            count++;
        }
        while(i < n){
            while(i+1< n && a[i] == a[i+1])
                i++;
            i++;
            count++;
        }
        while( j < m ){
            while(j+1<m && b[j] == b[j+1])
                j++;
            j++;
            count++;
        }
    
        return count;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        
        
        for(int i = 0; i < m; i++){
            b[i] = sc.nextInt();
        }
        out.println(doUnion(a, n, b, m));
        out.flush();
    }
}

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =  s.nextInt();
        s.close();
        System.out.print(optimalCountDigit(n));

    }
    public static int countDigit(int n){
        int count  = 0;
        while(n>0){
            n/=10;
            count++;
        }
        return count;
    }

    public static int optimalCountDigit(int n){
        return (int)(Math.log10(n) + 1); 
    }
}

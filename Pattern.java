import java.util.Scanner;

public class Pattern {
    /*
     * this class have all pattern problems solution from striver A2Z
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        // patternRectangle(n);
        patternRightTriangleNumUpsideDown(n);
    }

    static void patternRectangle(int n){
        StringBuffer buffer = new StringBuffer();

        for(int i = 0 ; i < n; i++){
            
            for(int j = 0; j < n; j++){
                buffer.append('*');
            }
            if(i != n-1)
                buffer.append('\n');
        }

        System.out.print(buffer.toString());
    }

    static void patternRightTriangle(int n){
        StringBuffer buffer = new StringBuffer();
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                buffer.append('*');
            }
            if( i != n-1)
                buffer.append('\n');
        }
        System.out.print(buffer.toString());
    }

    static void patternRightTriangleNum(int n){
        StringBuffer buffer = new StringBuffer();
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                buffer.append(j+1);
            }
            if( i != n-1)
                buffer.append('\n');
        }
        System.out.print(buffer.toString());
    }

    static void patternRightTriangleSingleNum(int n){
        StringBuffer buffer = new StringBuffer();
        for(int i=1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                buffer.append(i);
            }
            if( i != n)
                buffer.append('\n');
        }
        System.out.print(buffer.toString());
    }

    static void patternRightTriangleUpsideDown(int n){
        StringBuffer buffer = new StringBuffer();
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i; j++){
                buffer.append('*');
            }
            if( i != n-1)
                buffer.append('\n');
        }
        System.out.print(buffer.toString());
    }

    static void patternRightTriangleNumUpsideDown(int n){
        StringBuffer buffer = new StringBuffer();
        for(int i=n; i>0; i--){
            for(int j = 1; j<=i; j++){
                buffer.append(j);
            }
            if( i != 1)
                buffer.append('\n');
        }
        System.out.print(buffer.toString());
    }

    static void patternTriangle(int n){
        StringBuffer buffer = new StringBuffer();
        for(int i=0; i < n; i++){
            for(int j = 0; j<n; j++){
                // TODO implement 
            }
            if( i != 0)
                buffer.append('\n');
        }
        System.out.print(buffer.toString());
    }


}

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
        patternNumberCrown(n);
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
        if(n <= 0)return;
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
        if(n <= 0)return;
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

    static void patternPyramid(int n){
        if(n<1 && n>25)return;
        StringBuffer buffer = new StringBuffer();
        for(int i=0; i < n; i++){
            int numChars = 2*n - 1;
            for(int j = 0; j<=numChars; j++){
                if( j>= n-1-i && j <= n-1+i)
                    buffer.append('*');
                else
                    buffer.append(' ');

            }
            if( i < n - 1)
                buffer.append('\n');
        }
        System.out.print(buffer.toString());
    }

    static void patternInvertedPyramid(int n){
        if(n<1 && n>25)return;
        StringBuffer buffer = new StringBuffer();
        for(int i=0; i < n; i++){
            int numChars = 2*n - 1;
            for(int j = 0; j<=numChars; j++){
                if( j>= i && j < numChars - i)
                    buffer.append('*');
                else
                    buffer.append(' ');

            }
            if( i < n - 1)
                buffer.append('\n');
        }
        System.out.print(buffer.toString());
    }

    static void patternDiamondStar(int n){
        patternPyramid(n);
        System.out.println();
        patternInvertedPyramid(n);
    }

    static void patternhalfDiamondStar(int n){
        if(n<1 && n>25)return;
        patternRightTriangle(n);
        if(n>1)
        {
            System.out.println();
            patternRightTriangleUpsideDown(n-1);
        }
    }

    static void patternBinaryTriangle(int n){
        if(n<1)return;
        StringBuffer buffer = new StringBuffer();
        for(int i=1; i<=n; i++){
            int strtBit = i%2;
            for(int j=1;j<=i;j++){
                buffer.append(strtBit);
                strtBit = 1 - strtBit;
            }
            if(i<n)
                buffer.append('\n');
        }
        System.out.print(buffer.toString());
    }

    static void patternNumberCrown(int n){
        if(n<1)return;
        StringBuffer buffer = new StringBuffer();
        int space = 2*(n - 1);
        for(int i = 1; i<=n; i++){
            //first approach correct but better approach below
            // for(int j=1; j<=2*n; j++){
            //     if(j<=n){
            //         if(j<=i)
            //             buffer.append(j);
            //         else
            //             buffer.append(' ');
            //     }else {
            //         if(2*n - (j-1) <= i)
            //             buffer.append(2*n - (j-1));
            //         else
            //             buffer.append(' ');
            //     }
            // }
            //Number
            for(int j=1; j<=i; j++)
                buffer.append(j);
            
            //Space
            for(int j=0; j<space; j++)
                buffer.append(' ');
            
            //Number
            for(int j=i; j>=1; j--)
                buffer.append(j);
            
            if(i<n)
                buffer.append('\n');
            space-=2;
        }
        System.out.print(buffer.toString());
    }
}

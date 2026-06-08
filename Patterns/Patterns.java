public class Patterns{
    public static void main(String[] args) {

        int n = 4;

        // Pattern 1
        // 1
        // 12
        // 123
        // 1234
        System.out.println("Pattern 1");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        // Pattern 2
        // 1234
        // 123
        // 12
        // 1
        System.out.println("\nPattern 2");
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        // Pattern 3
        //    1
        //   12
        //  123
        // 1234
        System.out.println("\nPattern 3");
        for(int i=1;i<=n;i++){

            for(int s=1;s<=n-i;s++)
                System.out.print(" ");

            for(int j=1;j<=i;j++)
                System.out.print(j);

            System.out.println();
        }

        // Pattern 4
        // 1
        // 21
        // 321
        // 4321
        System.out.println("\nPattern 4");
        for(int i=1;i<=n;i++){
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }

        // Pattern 5
        // 4321
        // 321
        // 21
        // 1
        System.out.println("\nPattern 5");
        for(int i=n;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }

        // Pattern 6
        // *
        // **
        // ***
        // ****
        System.out.println("\nPattern 6");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Pattern 7
        // ****
        // ***
        // **
        // *
        System.out.println("\nPattern 7");
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Pattern 8 (Diamond Type)
        // 1
        // 12
        // 123
        // 12
        // 1
        System.out.println("\nPattern 8");
        for(int i=1;i<=3;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        for(int i=2;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        // Pattern 9 (Floyd Triangle)
        // 1
        // 2 3
        // 4 5 6
        // 7 8 9 10
        System.out.println("\nPattern 9");

        int num=1;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
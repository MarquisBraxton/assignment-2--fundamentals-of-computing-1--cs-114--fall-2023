import java.util.Scanner;

public class Diamond{
    public Diamond() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the diameter of the diamond: ");
        int diameter = scanner.nextInt();

        int n = diameter / 2;
        int a;
        int y;
        int q;

        if (diameter % 2 == 0) {
            for(q=0; 0 < n-q; q++) {
                System.out.print("  ");
            }
            System.out.print("*");
            for(a=0; a < n; a++) {
                for(y=0;y < n-a;y++) {
                    System.out.print("  ");
                }

                for(y=1;y < 2 * a+1;y++) {
                    System.out.print(" *");
                }

                System.out.println();

            }

            for(a = n; a >= 0; --a) {
                for(y=0;y < n-a;y++) {
                    System.out.print("  ");
                }

                for(y=1;y < 2 * a+1;y++) {
                    System.out.print(" *");
                }

                System.out.println();


            }
            for(q=0; 0 < n-q; q++) {
                System.out.print("  ");
            }
            System.out.print("*");
        }

        if (diameter % 2 == 1) {
            for(a=0; a < n;a++) {
                for(y=0;y < n-a;y++) {
                    System.out.print(" ");
                }

                for(y=0;y < 2 * a+1;y++) {
                    System.out.print("*");
                }

                System.out.println();
            }

            for(a = n; a >= 0; --a) {
                for(y=0;y < n-a;y++) {
                    System.out.print(" ");
                }

                for(y=0;y < 2 * a+1;y++) {
                    System.out.print("*");
                }

                System.out.println();
            }
        }

        scanner.close();
    }
}

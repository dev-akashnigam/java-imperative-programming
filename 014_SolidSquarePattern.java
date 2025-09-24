import java.util.Scanner;

class SolidSquarePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number of rows in the square pattern: ");
        int number = scanner.nextInt();

        for(int row=1; row<=number; row++) {
            for(int col=1; col<=number; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

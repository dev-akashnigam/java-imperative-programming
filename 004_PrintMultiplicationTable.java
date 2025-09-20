// Read a number and print its multiplication table.

import java.util.Scanner;
class PrintMultiplicationTable {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int num = scanner.nextInt();

        for(int i=1; i<=10; i++) {
            System.out.printf("%d X %d = %d%n", num, i, num*i);
        }

        scanner.close();
    }
}

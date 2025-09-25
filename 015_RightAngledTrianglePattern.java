import java.util.Scanner;
class RightAngledTrianglePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number of rows required in printing right angled triangle pattern: ");
        int rowCount = scanner.nextInt();

        for(int row=1; row<=rowCount; row++) {
            for(int col=1; col<=row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
import java.util.Scanner;
class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int num = scanner.nextInt();
        int originalNum = num;

        int reversedNum = 0;
        int lastDigit;

        while(num!=0) {
            lastDigit = num % 10;
            reversedNum = reversedNum * 10 + lastDigit;

            num = num / 10;
        }

        System.out.printf("Reverse of number %d = %d", originalNum, reversedNum);

        scanner.close();
    }   
}

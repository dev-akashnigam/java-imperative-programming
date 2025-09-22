import java.util.Scanner;
class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();

        if(number<=1) {
            System.out.printf("Number %d is NOT PRIME.%n", number);
        }
        else if(number == 2) {
            System.out.printf("Number %d is PRIME.%n", number);
        }
        else if(number%2 == 0) {
            System.out.printf("Number %d is NOT PRIME.%n", number);
        }
        else {
            int sqrt = (int)Math.sqrt(number);
            boolean isPrime = true;
            for(int i=3; i<=sqrt; i+=2) {
                if(number%i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                System.out.printf("Number %d is PRIME.%n", number);
            }
            else {
                System.out.printf("Number %d is NOT PRIME.%n", number);
            }
        }
        scanner.close();
    }
}

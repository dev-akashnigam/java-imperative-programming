import java.util.Scanner;

class PerfectNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();

        int sumOfDivisors = 0;
        int halfOfNumber = number / 2;
        for(int i=1; i<=halfOfNumber; i++) {
            if(number%i == 0) {
                sumOfDivisors = sumOfDivisors + i;
            }
        }

        if(sumOfDivisors == number) {
            System.out.printf("Number: %d is a PERFECT NUMBER.", number);
        }
        else {
            System.out.printf("Number: %d is NOT PERFECT NUMBER.", number);
        }

        scanner.close();
    }
}

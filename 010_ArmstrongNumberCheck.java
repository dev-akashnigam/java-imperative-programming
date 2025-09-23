import java.util.Scanner;

class ArmstrongNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int num = scanner.nextInt();
        int numCopy1 = num;
        int numCopy2 = num;

        int countOfDigitsInNumber = 0;
        while(num!=0) {
            num = num / 10;
            countOfDigitsInNumber++;
        }

        int lastDigit;
        int sum = 0;
        while(numCopy1!=0) {
            lastDigit = numCopy1 % 10;
            sum = sum + (int)Math.pow(lastDigit, countOfDigitsInNumber);

            numCopy1 = numCopy1 / 10;
        }

        if(sum == numCopy2) {
            System.out.printf("Number %d is ARMSTRONG NUMBER.", numCopy2);
        }
        else {
            System.out.printf("Number %d is NOT ARMSTRONG NUMBER.", numCopy2);
        }
        
        scanner.close();
    }
}

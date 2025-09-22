import java.util.Scanner;
class SumOfFirstNNaturalNos {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number till where you need the sum of natural number: ");
        int num = scanner.nextInt();

        int sum = 0;
        for(int i=1; i<=num; i++) {
            sum += i;
        }

        System.out.printf("Sum of first %d natural numbers = %d", num, sum);

        scanner.close();
    }
}

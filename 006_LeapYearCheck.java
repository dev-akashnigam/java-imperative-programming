import java.util.Scanner;
class LeapYearCheck {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the year: ");
        int year = scanner.nextInt();

        if(year%100 == 0) {
            if(year%400 == 0) {
                System.out.printf("Year: %d is a leap year", year);
            }
            else {
                System.out.printf("Year: %d is NOT A leap year", year);
            }
        }
        else {
            if(year%4 == 0) {
                System.out.printf("Year: %d is a leap year", year);
            }
            else {
                System.out.printf("Year: %d is NOT A leap year", year);
            }
        }

        scanner.close();
    }
}

import java.util.Scanner;

class HCF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first number: ");
        int firstNum = scanner.nextInt();

        System.out.println("Please enter the second number: ");
        int secondNum = scanner.nextInt();

        int largerNum;
        int smallerNum;
        if(firstNum > secondNum) {
            largerNum = firstNum;
            smallerNum = secondNum;
        }
        else {
            largerNum = secondNum;
            smallerNum = firstNum;
        }

        int hcf=1;
        for(int i=smallerNum; i>1; i--) {
            if(largerNum%i==0 && smallerNum%i==0) {
                hcf = i;
                break;
            }
        }
        System.out.printf("HCF of %d and %d = %d", firstNum, secondNum, hcf);
        scanner.close();
    }
}

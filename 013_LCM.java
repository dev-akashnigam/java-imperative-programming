import java.util.Scanner;

class LCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter first number: ");
        int firstNum = scanner.nextInt();

        System.out.println("Please enter second number: ");
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

        int lcm;
        for(int i=1; ; i++) {
            if((largerNum*i)%smallerNum==0) {
                lcm = largerNum*i;
                break;
            }
        }

        System.out.printf("LCM of %d and %d = %d", firstNum, secondNum, lcm);
        scanner.close();
    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int result;

        System.out.println("Enter a number to obtain the sum of natural numbers that are multiples of 3 or 5.");

        number = scanner.nextInt();

        result = sum(number);

        System.out.printf("The total sum is %d", result);

        scanner.close();
    }

    public static int sum (int number){
        int sum = 0;
        for (int i = 0; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0)
                sum += i;

        }
        return sum;
    }

}

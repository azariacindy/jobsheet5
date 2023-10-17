import java.util.Scanner;

public class trialSelection3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double number1, number2, result;
        char operator;

        System.out.print("Enter the first number: ");
        number1 = input.nextDouble();
        System.out.print("Enter the second number: ");
        number2 = input.nextDouble();
        System.out.print("Insert operator (+ - * /): ");
        operator = input.next().charAt(0);

        switch (operator) {
            case '+':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                //no break here
                 // Don't forget to break each case
            case '-':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;
            case '*':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;
            case '/':
                if (number2 != 0) {
                    result = number1 / number2;
                    System.out.println(number1 + " / " + number2 + " = " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
        }

        input.close();
    }
}

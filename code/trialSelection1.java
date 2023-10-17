import java.util.Scanner; // Import library Scanner

public class trialSelection1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input number : ");
        int number = input.nextInt();
        
        //This means that if the condition (number % 2 == 0) is true (the number is even),
        //the message will be set to "is even number." If the condition is false (the number is odd),
        //the message will be set to "is odd number."
        String message = (number % 2 == 0) ? "is even number" : "is odd number";
        System.out.println("Number " + number + " " + message);

        input.close();
    }
}

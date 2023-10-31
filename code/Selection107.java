import java.util.Scanner; // Import library Scanner

public class Selection107 {
    public static void main(String[] args) {
        
        Scanner input07 = new Scanner(System.in);
        System.out.print("Input number : ");
        int number = input07.nextInt();
        
        //This means that if the condition (number % 2 == 0) is true (the number is even),
        //the message will be set to "is even number." If the condition is false (the number is odd),
        //the message will be set to "is odd number."
        // if(number%2 == 0){
        //     System.out.println(number + " is an even number!");
        // } else {
        //     System.out.println(number + " is an odd number!");
        // }

        String message = (number % 2 == 0) ? "is even number" : "is odd number";
        System.out.println("Number " + number + " " + message);

        input07.close();
    }
}

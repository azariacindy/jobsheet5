import java.util.Scanner; // Import library Scanner

public class trialSelection2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input uas score : ");
        float uas = input.nextFloat();
        System.out.print("Input uts score : ");
        float uts = input.nextFloat();
        System.out.print("Input quiz score : ");
        float quiz = input.nextFloat();
        System.out.print("Input assignment score : ");
        float ass = input.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (quiz * 0.1F) + (ass * 0.2F);

        if (total > 80 && total <= 100) { //If the total score is greater than 80 and less than or equal to 100, the result is A with the qualification "Excellent."
            System.out.println("Final score " + total + " equivalent to A / 4 with Excellent qualification");
        } else if (total > 73 && total <= 80) { //If the total score is greater than 73 and less than or equal to 80, the result is B+ with the qualification "More than Good."
            System.out.println("Final score " + total + " equivalent to B+ / 3.5 with More than Good qualification");
        } else if (total > 65 && total <= 73) { //If the total score is greater than 65 and less than or equal to 73, the result is B with the qualification "Good."
            System.out.println("Final score " + total + " equivalent to B / 3 with Good qualification");
        } else if (total > 60 && total <= 65) { //If the total score is greater than 60 and less than or equal to 65, the result is C+ with the qualification "More than Sufficient."
            System.out.println("Final score " + total + " equivalent to C+ / 2.5 with More than Sufficient qualification");
        } else if (total > 50 && total <= 60) { //If the total score is greater than 50 and less than or equal to 60, the result is C with the qualification "Sufficient."
            System.out.println("Final score " + total + " equivalent to C / 2 with Sufficient qualification");
        } else if (total > 39 && total <= 50) { //If the total score is greater than 39 and less than or equal to 50, the result is D with the qualification "Less."
            System.out.println("Final score " + total + " equivalent to D / 1 with a qualification of Less");
        } else if (total <= 39) { //If the total score is less than or equal to 39, the result is E with the qualification "Failure!"
            System.out.println("Final score " + total + " equivalent to E / 0 with a qualification of Failure!");
        } else { // If the input doesn't match such as numbers 1-100 then, the result is "Invalid values"
            System.out.println("Invalid values. Please enter a value between 0 and 100.");
        }

        input.close();
    }
}

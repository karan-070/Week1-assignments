import java.util.Scanner;
public class NumberInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Enter the Number :");              // Continuously prompt the user for a number
            int num= sc.nextInt();
            if(num>=0){
                continue;                                          //If the number is positive the loop continues
            }
            else{
                break;                                             //Negative number and loop ends
            }
        }
        System.out.println("Loop Exited" );                        //Message that loop ended
    }
}

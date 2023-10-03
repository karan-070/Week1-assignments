import java.util.Scanner;
public class stopAt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Enter the Number :");
            int num= sc.nextInt();
            if(num>=0){
                continue;
            }
            else{
                break;
            }
        }
        System.out.println("Loop Exited" );
    }
}

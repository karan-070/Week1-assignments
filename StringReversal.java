import java.util.Scanner;
public class StringReversal {
    static String reverseString(String s){
        char[] st=s.toCharArray();                                 //Converting the string to character array
        int i=0;                                                   //Pointer from start
        int k=st.length-1;                                         //Pointer from end
        char temp='\0';                                            //Temp variable for swapping
        while(i<k){
            temp=st[i];
            st[i]=st[k];                                           //Swapping the elements from start with the end till 'i' is less than 'k'
            st[k]=temp;
            i++;
            k--;
        }
        String res=String.valueOf(st);                             //Converting the character array back to string
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The String to be Reversed : " );
        String s=sc.nextLine();                                    //Taking the user input
        System.out.println("Original String is "+s);               //Printing the original string
        System.out.println("Reverse of the String is "+reverseString(s));    //Printing the reversed string

    }
}

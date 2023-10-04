import java.util.Scanner;
public class revString {
    static String stringReversed(String s){
        char[] st=s.toCharArray();
        int i=0;
        int k=st.length-1;
        char temp='\0';
        while(i<k){
            temp=st[i];
            st[i]=st[k];
            st[k]=temp;
            i++;
            k--;
        }
        String res=String.valueOf(st);
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The String to be Reversed : " );
        String s=sc.nextLine();
        System.out.println("Original String is "+s);
        System.out.println("Reverse of the String is "+stringReversed(s));

    }
}

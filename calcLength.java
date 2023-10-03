import java.lang.String;
public class calcLength {
    public static int lengthCalc(String s){
        String str=s+'\0';
        int size=0;
        int i=0;
        while(str.charAt(i)!='\0'){
            size++;
            i++;
        }
        return size;
    }
    public static void main(String[] args) {
        String s="Welcome to Clarivate!";
        System.out.println("Length of the String is " + lengthCalc(s));
    }
}

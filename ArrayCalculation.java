import java.util.Scanner;
public class ArrayCalculation {
    public static int[] max(int a[],int b[],int s){                   // Method to find the maximum value between two numbers
        int maximum[]=new int[s];                                     // Initialize an array to store the result
        for(int i=0;i<s;i++)
        {
            if(a[i]>b[i])
            {
                maximum[i]=a[i];                                          //Going through each element of a and b
            }
            else{
                maximum[i]=b[i];
            }
        }
        return maximum;
    }
    public static void CalculateArray(int res[],int a[], int b[],int s){    // Method to calculate array c from arrays a and b
        double c[]=new double[s];                                           // Initialize an array to store the result
        for(int i=0;i<s;i++)
        {
            c[i]=(double)res[i]+(double)a[i]/b[i];                          //Getting the result
        }
        System.out.println("Resultant Array is : ");
        for(int j=0;j<s;j++)
        {
            System.out.println(c[j]);                                       //Printing the 'c' array
        }
    }

    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.println("Enter the size of the arrays: ");               //Taking User input for size of array 'a' and 'b'
        int size=n.nextInt();
        Scanner first=new Scanner(System.in);
        Scanner second=new Scanner(System.in);
        int[] a= new int[size];
        int[] b= new int[size];
        System.out.println("Enter the elements of the first array :");
        for(int i=0;i<size;i++)
        {
            a[i]= first.nextInt();                                          //Taking user input for elements of array 'a'
        }
        System.out.println("Enter the elements of the second array :");
        for(int i=0;i<size;i++)
        {
            b[i]= first.nextInt();                                           //Taking user input for elements of array 'a'
        }
        //int a[]={22,3,455,79,8,305};
        //int b[]={55,6,77,43,332,46};
        int res[]=max(a,b,size);                                             //Calling the max method
        CalculateArray(res,a,b,size);                                        //Printing the resultant array
    }
}

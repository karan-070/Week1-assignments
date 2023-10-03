import java.util.Scanner;
public class resultant1 {
    public static int[] calcMax(int num1[],int num2[],int s){
        int max[]=new int[s];
        for(int i=0;i<s;i++)
        {
            if(num1[i]>num2[i])
            {
                max[i]=num1[i];
            }
            else{
                max[i]=num2[i];
            }
        }
        return max;
    }
    public static void resultArray(int res[],int a[], int b[],int s){
        double c[]=new double[s];
        for(int i=0;i<s;i++)
        {
            c[i]=(double)res[i]+(double)a[i]/b[i];
        }
        System.out.println("Resultant Array is : ");
        for(int j=0;j<s;j++)
        {
            System.out.println(c[j]);
        }
    }

    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.println("Enter the size of the arrays: ");
        int size=n.nextInt();
        Scanner first=new Scanner(System.in);
        Scanner second=new Scanner(System.in);
        int[] a= new int[size];
        int[] b= new int[size];
        System.out.println("Enter the elements of the first array :");
        for(int i=0;i<size;i++)
        {
            a[i]= first.nextInt();
        }
        System.out.println("Enter the elements of the second array :");
        for(int i=0;i<size;i++)
        {
            b[i]= first.nextInt();
        }
        //int a[]={22,3,455,79,8,305};
        //int b[]={55,6,77,43,332,46};
        int res[]=calcMax(a,b,size);
        resultArray(res,a,b,size);
    }
}

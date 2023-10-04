public class ArraySumCalculator {
    public static void main(String[] args) {
        int num[]={5,7,6,9,8,1,-15,2,6};              //Defining the num array
        int size=0;
        for(int m:num)                                //calculating the array size
        {
            size++;
        }
        System.out.println("Sum of the Array is : "+calculateArraySum(num,size));   //Calcuate and print the sum of array elements
        printArray(num,size);                                              //Print the array elements
    }
    public static int calculateArraySum(int num[],int si){                            //Method to calculate the sum of the elements of array
        int sum=0;
        for(int i=0;i<si;i++)
        {
            sum+=num[i];
        }
        return sum;
    }
    public static void printArray(int num[],int si){                         // Method to print the array
        System.out.println("Elements of array are :");
        for(int k=0;k<si;k++)
        {
            System.out.print(num[k]+",");
        }
    }
}

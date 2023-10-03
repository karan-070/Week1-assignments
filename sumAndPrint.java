public class sumAndPrint {
    public static void main(String[] args) {
        int num[]={5,7,6,9,8,1,-15,2,6};
        int size=0;
        for(int m:num)
        {
            size++;
        }
        System.out.println("Sum of the Array is : "+sum(num,size));
        print(num,size);
    }
    public static int sum(int num[],int si){
        int s=0;
        for(int i=0;i<si;i++)
        {
            s+=num[i];
        }
        return s;
    }
    public static void print(int num[],int si){
        System.out.println("Elements of array are :");
        for(int k=0;k<si;k++)
        {
            System.out.print(num[k]+",");
        }
    }
}

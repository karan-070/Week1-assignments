public class AverageCalculator {
    public static void main(String[] args) {
        int nums[]={5,7,6,9,8,1,-15,2,6}; //Define the array
        int size=0;                       // Initialize a variable to store the length of the array
        for(int i:nums){
            size++;                       // Increment the size variable
        }
        System.out.println("Average of the sum of the elements in the array is : " + CalculatingAverage(nums,size)); //Getting the Average
    }
    public static double CalculatingAverage(int n[],int si){
        int sum=0;                        //Initializing a variable to calculate the sum
        for(int i=0;i<si;i++){
            sum+=n[i];                    // Calculate the sum of elements in the array
        }
        double avg=(sum/si);              // Calculate the average
        return avg;
    }
}

public class averageSum {
    public static void main(String[] args) {
        int nums[]={5,7,6,9,8,1,-15,2,6};
        int size=0;
        for(int i:nums){
            size++;
        }
        System.out.println("Average of the sum of the elements in the array is : " + sumAvg(nums,size));
    }
    public static double sumAvg(int n[],int si){
        int sum=0;
        for(int i=0;i<si;i++){
            sum+=n[i];
        }
        double avg=(sum/si);
        return avg;
    }
}

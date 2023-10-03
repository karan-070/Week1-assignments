public class ReverseStringArray {
    public static void main(String[] args) {
        String[] inputArray = {"Jawan", "Pathan", "Java"};

        System.out.println("Original Array:");
        printArray(inputArray);

        reverseArray(inputArray);

        System.out.println("Reversed Array:");
        printArray(inputArray);
    }

    public static void reverseArray(String[] array) {
        String temp = array[0];
        array[0] = array[2];
        array[2] = temp;
    }
    
    public static void printArray(String[] array) {
        for (String element : array) {
            System.out.println(element);
        }
    }
}


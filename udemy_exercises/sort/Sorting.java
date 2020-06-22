import java.util.Arrays;
import java.util.Scanner;

public class Sorting {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How many numbers would you like to sort?:");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] returnedArray = getIntegers(count);
        int returnedDescending = sortIntegers(returnedArray);

        System.out.println("Print Array = " + Arrays.toString(returnedArray));
        
        System.out.println("Minimum Value = " + returnedDescending);

    }

    private static int[] getIntegers(int count) {

        int[] array = new int[count];

        for(int i = 0; i<array.length; i++) {
            System.out.println("Enter your number:");
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }
        return array;
    }

    public static int sortIntegers(int[] array) {

        int descending = Integer.MAX_VALUE;

        for(int i=0; i<array.length; i++) {
            int value = array[i];

            if(value < descending) {
                descending = value;
            }
        }

        return descending;
    }


}
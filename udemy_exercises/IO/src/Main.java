import java.util.Arrays;
import java.util.Scanner;

public class Main {

  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("How many numbers are you sorting?:");
    int count = scanner.nextInt();
    scanner.nextLine();

    int[] returnedArray = input(count);
    int returnedmin = output(returnedArray);

    System.out.println("Your Array = " + Arrays.toString(returnedArray));

    System.out.println("Minimum Value = " + returnedmin);

  }

  private static int[] input(int count) {

    int[] array = new int[count];

    for(int i = 0; i<array.length; i++) {
      System.out.println("Enter a number:");
      int number = scanner.nextInt();
      scanner.nextLine();
      array[i] = number;
    }
    return array;
  }

  public static int output(int[] array) {

    int min = Integer.MAX_VALUE;

    for(int i=0; i<array.length; i++) {
      int value = array[i];

      if(value < min) {
        min = value;
      }
    }

    return min;
  }


}
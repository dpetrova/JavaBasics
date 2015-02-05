import java.util.ArrayList;
import java.util.Scanner;

//import org.apache.commons.lang.time.StopWatch;

public class _04_InsertionSort {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] numbers = scan.nextLine().replace("[", "").replace("]", "").split(", ");
        ArrayList<Integer> numbersArr = new ArrayList<Integer>();

        //Parse the numbers and add them to the list
        for (int i = 0; i < numbers.length; i++) {
			numbersArr.add(Integer.parseInt(numbers[i]));
		}

//        StopWatch stopWatch = new StopWatch();
//        stopWatch.start();

        //Sorting algorithm that: •	Mark the first element as sorted;
        //•	Remove the current element from the list;
        //•	Start iterating to the left to find which position is suitable for the current element. A suitable position is considered a place where the element to the left is no longer bigger than the current element.

        int i, j, newValue;
        for (i = 1; i < numbersArr.size(); i++) {
              newValue = numbersArr.get(i);
              j = i;
              while (j > 0 && numbersArr.get(j - 1) > newValue) {
            	  numbersArr.set(j, numbersArr.get(j - 1));
                    j--;
              }
              numbersArr.set(j, newValue);
        }

//        stopWatch.stop();
//        long time = stopWatch.getTime();

        System.out.println(numbersArr);
//        System.out.println(time/1000.0);
    }
}
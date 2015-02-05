
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//import org.apache.commons.lang.time.StopWatch;

public class _02_BubbleSortEnhanced {

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

        //Sorting algorithm that compare two elements and swap them if the first one has a bigger
        //value than the second one; at the end of the loop iteration, save the number of elements
        //that are sorted
        boolean swapped;
        do {
			swapped = false;
			for (int i = 0; i < numbersArr.size() - 1; i++) {
				for (int j = 0; j < numbersArr.size() - i - 1; j++) {
					if (numbersArr.get(i) > numbersArr.get(i + 1)) {
						Collections.swap(numbersArr, i, i + 1);
						swapped = true;
					}
				}
			}
			
		} while (swapped);

//        stopWatch.stop();
//        long time = stopWatch.getTime();

        System.out.println(numbersArr);
//        System.out.println(time/1000.0);
    }
}

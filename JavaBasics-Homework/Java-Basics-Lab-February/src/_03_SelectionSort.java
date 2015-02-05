import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//import org.apache.commons.lang.time.StopWatch;

public class _03_SelectionSort {

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

        //Sorting algorithm that find the smallest number in the list; then at the end of the 
        //iteration swap the positions of the smallest number with the first element of the list;
        //then start iterating from the next element.
        for (int i = 0; i < numbersArr.size(); i++) {
        	int minElement = numbersArr.get(i);
        	for (int j = i; j < numbersArr.size(); j++) {
    			if (numbersArr.get(j) < minElement) {
    				minElement = numbersArr.get(j);
    			}
        	}
        	Collections.swap(numbersArr, numbersArr.indexOf(minElement), i);
//        	int temp = numbersArr.get(i);
//			numbersArr.set(i, minElement);
//			numbersArr.set(numbersArr.indexOf(minElement), temp);
        }
        

//        stopWatch.stop();
//        long time = stopWatch.getTime();

        System.out.println(numbersArr);
//        System.out.println(time/1000.0);
    }
}
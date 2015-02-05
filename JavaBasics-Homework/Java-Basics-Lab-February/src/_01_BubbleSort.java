import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import javax.imageio.stream.IIOByteBuffer;

//import org.apache.commons.lang3.time.StopWatch;


public class _01_BubbleSort {

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
        //value than the second one
        
//       I.var
        boolean swapped;
        do {
			swapped = false;
			for (int i = 1; i < numbersArr.size(); i++) {
				if (numbersArr.get(i - 1) > numbersArr.get(i)) {
					Collections.swap(numbersArr, i - 1, i);
					swapped = true;
				}
			}
			
		} while (swapped);
        
//      II.var
//      for (int i = 0; i < numbersArr.size() - 1; i++) {
//			if (numbersArr.get(i) > numbersArr.get(i + 1)) {
//				Collections.swap(numbersArr, i, i + 1);
//				i = -1;
//			}
//		}
        
//      III.var
//      for (int i = 0; i < numbersArr.size() - 1; i++) {
//        	if (numbersArr.get(i) > numbersArr.get(i + 1)) {
//				int temp = numbersArr.get(i);
//				numbersArr.set(i, numbersArr.get(i + 1));
//				numbersArr.set(i + 1, temp);
//				i = -1;
//			}
//		}
        

//        stopWatch.stop();
//        long time = stopWatch.getTime();

        System.out.println(numbersArr);
//        System.out.println(time/1000.0);
    }
}

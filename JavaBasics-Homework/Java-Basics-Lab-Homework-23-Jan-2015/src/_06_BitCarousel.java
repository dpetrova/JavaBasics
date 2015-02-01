

import java.util.Scanner;

public class _06_BitCarousel {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long number = Long.parseLong(input.nextLine());
        //System.out.println(Long.toBinaryString(number));
        long rotations = Long.parseLong(input.nextLine());

        for (int i = 0; i < rotations; i++) {
            String direction = input.nextLine();
            if (direction.equals("right")) {
                long rightMostBit = number & 1;
                number >>= 1;
        		//System.out.println(Long.toBinaryString(number));
                number |= (rightMostBit << 5);
                //System.out.println(Long.toBinaryString(number));
            }
            else if (direction.equals("left")) {
                long leftMostBit = (number >> 5) & 1;
                number <<= 1;
                //System.out.println(Long.toBinaryString(number));
                number &= ~(1 << 6);
                number |= leftMostBit;
                //System.out.println(Long.toBinaryString(number));
            }
        }

        System.out.println(number);
    }
}

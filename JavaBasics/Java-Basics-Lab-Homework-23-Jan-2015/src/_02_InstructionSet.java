//package InstructionSet;

import java.util.Scanner;

public class _02_InstructionSet {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long result = 0;      
        while (true) {
        	String opCode = input.nextLine();
        	if (opCode.equals("END")) {
				break;
			}
        	String[] codeArgs = opCode.split(" ");
            switch (codeArgs[0]) {
                case "INC": {
                	long operandOne = Long.parseLong(codeArgs[1]);
                    result = operandOne + 1;
                    break;
                }
                case "DEC": {
                	long operandOne = Long.parseLong(codeArgs[1]);
                    result = operandOne - 1;
                    break;
                }
                case "ADD": {
                	long operandOne = Long.parseLong(codeArgs[1]);
                	long operandTwo = Long.parseLong(codeArgs[2]);
                    result = operandOne + operandTwo;
                    break;
                }
                case "MLA": {
                    long operandOne = Long.parseLong(codeArgs[1]);
                    long operandTwo = Long.parseLong(codeArgs[2]);
                    result = operandOne * operandTwo;
                    break;
                }
//                default:
//                    break;
            }

            System.out.println(result);
        }
    }
}

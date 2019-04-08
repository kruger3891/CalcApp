package se.lexicon.CalcApp;

import java.util.Scanner;

public class App {
	
	static Scanner sc = new Scanner(System.in);
	
    public static void main( String[] args ){
       
    	double num1, num2, result;
		char operation;
		boolean run = true;
		
		
		while(run) {
			num1 = getDouble();
	        operation = getOperation();
	        num2 = getDouble();
	        result = calc(num1,num2,operation);
	        System.out.println("Operation result: " + result);
		}
	}
	public static Double getDouble(){
        System.out.println("Insert the number:");
        double num;
        if(sc.hasNextDouble()){
            num = sc.nextDouble();
        } else {
            System.out.println("You made a mistake entering the number. try again.");
            sc.next();
            num = getDouble();
        }
        return num;
    }
    public static char getOperation(){
       System.out.println("Enter operation: \n   +\n   -\n   *\n   /");
        char operation;
        if(sc.hasNext()){
            operation = sc.next().charAt(0);
        } else {
            System.out.println("You made a mistake when entering the operation. try again.");
            sc.next();
            operation = getOperation();
        }
        return operation;
    }
    public static double calc(double num1, double num2, char operation){
        Double result;
        switch (operation){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
            	if(num1 == 0) {
            		System.out.println("Cannot division with 0.\n");
            	}else {
            		result = num1/num2;
            		break;
            	}
                
                
            default:
                System.out.println("The operation is not recognized. Repeat input.");
                result = calc(num1, num2, getOperation());
        }
        return result;
    	
    }
}

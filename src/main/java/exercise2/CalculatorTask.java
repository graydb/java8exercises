package exercise2;

public class CalculatorTask {
	public static void main (String[] args) {
		System.out.println(addTwo(8087d, 12345d));
		System.out.println(mulTwo(123d, 56d));
		System.out.println(minTwo(5653723d, 767d));
		divTwo (8d,4d);
		
	}
	
	   public static double addTwo(double num1, double num2) {
        return num1 + num2;
    }
       public static double minTwo(double num1, double num2) {
        return num1 - num2;
    }
       public static double mulTwo(double num1, double num2) {
           return num1 * num2;
       }
       
       public static void divTwo(double num1, double num2) {
        if (num1 < num2) {
        	System.out.println ("Division by zero cannot be completed");
        } else {
        System.out.println(num1 / num2);
    }
          
}

	
}


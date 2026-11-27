public class Sajot_methodactivity {
    
    static int calculate(int x, int y){
        return x + y;
    }
    static double calculate (double x, double y, char operator){
        switch (operator){
            case '+':
                return x + y;
            case '-':
                return x-y;
            case '*':
                return x*y;
            case '/':
                return x/y;
            default:
                throw new IllegalArgumentException("Invalid operator");
        }
    }
    
    public static void main(String[] args) {
            System.out.printf("The sum of 1 and 2 is %d%n", calculate(1,2));
            System.out.printf("The difference of 1 and 2 is %.2f%n", calculate(1,2,'-'));
            System.out.printf("The quotient of 1 and 2 is %.2f%n", calculate(1,2,'/'));
            System.out.printf("The product of 1 and 2 is %.2f%n", calculate(1,2,'*'));
            System.out.println("hello"));
            System.out.printf("The will produce an error", calculate(1,2,'p'));	
	}
}

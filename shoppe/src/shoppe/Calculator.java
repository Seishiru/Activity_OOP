package shoppe;

public class Calculator {
    public int add(int x, int y){
        return x + y;
    }
    
    // This method could throw an ArithmeticException
    public double divide(int x, int y) {
        double z = 0;
        try{
            z = x / y;
        }catch(ArithmeticException e){
            System.err.println("Error: Division by zero is not allowed." + e);
        }
        return z;
    }
}

/**
 * Calculator for simple operations (+, -, *, /)
 */
package calculator;

public class Calculator {

    public static void main(String[] args) {
        System.out.println(calc(5,15,'*'));
        System.out.println(calc(0.5, 115.4, '+'));
        System.out.println(calc(16, 118, '%'));
    }
    
    /**
     * Calculate operation for integer numbers
     * @param a - first integer number
     * @param b - second integer number
     * @param op - type of operation
     * @return String like "a op b = c", where c is solution
     */
    public static String calc(int a, int b, char op){
        switch (op){
            case '+':
                return a + " + " + b + " = " + (a + b);
            case '-':
                return a + " - " + b + " = " + (a - b);
            case '*':
                return a + " * " + b + " = " + (a * b);
            case '/':
                return a + " / " + b + " = " + (a / b);
        }
        return "Please, in operation use one of this symbols: \"+ , -, *, \"";
    }
    
    /**
     * Calculate operation for rational numbers
     * @param a - first rational number
     * @param b - second rational number
     * @param op - type of operation
     * @return String like "a op b = c", where c is solution
     */
    public static String calc(double a, double b, char op){
        switch (op){
            case '+':
                return a + " + " + b + " = " + (a + b);
            case '-':
                return a + " - " + b + " = " + (a - b);
            case '*':
                return a + " * " + b + " = " + (a * b);
            case '/':
                return a + " / " + b + " = " + (a / b);
        }
        return "Please, in operation use one of this symbols: \"+ , -, *, \"";
    }
}

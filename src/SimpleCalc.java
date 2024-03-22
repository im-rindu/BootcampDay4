import java.util.Scanner;

public class SimpleCalc {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        System.out.print("Input Number 1 : ");
        float number1 = myInput.nextFloat();
        System.out.print("Input Number 2 : ");
        float number2 = myInput.nextFloat();
        System.out.print("Input The operator (+ - * / %) : ");
        String theOperation = myInput.nextLine();
        theOperation = myInput.nextLine();
        myInput.close();
        
        switch (theOperation) {
            case "+":
                addition(number1, number2);
                break;
            case "-":
                reduction(number1, number2);
                break;
            case "/":
                division(number1, number2);
                break;
            case "*":
                multiplication(number1, number2);
                break;
            case "%":
                modulo(number1, number2);
                break;
            default:
                System.out.println("There is no "+theOperation+" operator");
                break;
        }
    }

    public static void addition(float num1, float num2){
        System.out.println(num1+" + " + num2+" = "+(num1+num2));
    }
    
    public static void reduction(float num1, float num2){
        System.out.println(num1+" - "+num2+" = "+(num1-num2));
    }
    
    public static void multiplication(float num1, float num2){
        System.out.println(num1+" * "+num2+" = "+(num1*num2));
    }
    
    public static void division(float num1, float num2){
        System.out.println(num1+" / "+num2+" = "+(num1/num2));
    }

    public static void modulo(float num1, float num2){
        System.out.println(num1+" % "+num2+" = "+(num1%num2));
    }
}

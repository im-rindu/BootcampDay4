import java.util.Scanner;

public class Fibonanci {
    public static int fibonanci(int n, int firstNum, int secNum){
        if(n <= 1){
            return firstNum;
        }else{
            return fibonanci(n-1,secNum, firstNum+secNum );
        }
    }
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter Fibonacci sequence numbers : ");
        int n = myScanner.nextInt();
        myScanner.close();

        System.out.println("Fibonanci no."+ n + " is " + fibonanci(n, 0, 1));
    }
}
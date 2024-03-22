import java.util.Scanner;

public class Fibonanci {
    public static int fibonanci(int numberNo, int firstNum, int secNum){
        if(numberNo <= 1){
            return firstNum;
        }else{
            return fibonanci(numberNo-1,secNum, firstNum+secNum );
        }
    }
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter Fibonacci sequence numbers : ");
        int numberNo = myScanner.nextInt();
        myScanner.close();

        System.out.println("Fibonanci no."+ numberNo + " is " + fibonanci(numberNo, 0, 1));
    }
}
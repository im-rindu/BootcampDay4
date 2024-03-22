public class App {
    public static void main(String[] args) throws Exception {
        int number = 1;
        increment(number);
        System.out.println("number inside main : " + number);
        
    }
    public static void increment(int number2){
        number2+=2;
        System.out.println("number inside increment : " + number2);
        
    }
}

import java.util.Scanner;

interface Calculator {
    int add(int a, int b);

    default int multiply(int a, int b){
        return a * b;
    }
    static int subtrct(int a, int b){
        return a - b;
    }
}
class SimpleCalculator implements Calculator{
    @Override
    public int add(int a, int b){
        return a + b;
    }
}
public class Main {
    public static void main(String[] args) {
        SimpleCalculator calc = new SimpleCalculator();
        Scanner stdin = new Scanner(System.in);
        System.out.println(" ");
        int a = stdin.nextInt();
        System.out.println("");
        int b = stdin.nextInt();
        System.out.println(calc.add(a , b));
        System.out.println(calc.multiply(a,b));
        System.out.println(Calculator.subtrct(a, b));
    }

    
}

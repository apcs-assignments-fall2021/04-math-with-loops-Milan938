import java.util.Scanner;

public class MyMain {

    // Calculates the factorial of a number
    public static double factorial(int x) {
        int y = 1;
        for (int i = 2; i <= x; i++) {
            y = y * i;
        }
        return y;
    }

    // Calculates the value for the math constant e iteratively
    // goes until it calculates an answer less than 0.00000000001 
    // different from the value Math.E
    public static double calculateE() {
        double e = 1;
        int num = 1;
        while (e - Math.E > 0.00001) {
            e = 1/factorial(num) + e;
            num = num + 1;
        }
        System.out.println(e);
        return e;
    }

    // Calculates the square root iteratively, using the Babylonian method
    public static double babylonian(double x) {
        double n = 5.0;
        double m = 0.0;
        while (n - x > 0.00001 || x - n > 0.00001) {
            m = (n + x/n) / 2;
            m = n;
        }
        return m;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //System.out.println(factorial(4));
        //calculateE();
        System.out.println(babylonian(125));


        

        scan.close();
    }
}

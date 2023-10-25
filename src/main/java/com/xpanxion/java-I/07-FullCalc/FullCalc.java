import java.util.Scanner;

public class FullCalc {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        try {
            System.out.println("Please enter two numbers: ");
            int num1 = console.nextInt();
            int num2 = console.nextInt();
            int res = 0;

            System.out.println("Enter operation (add, sub, mul, div): ");
            String input = console.next();

            if (input.matches("add")) {
                res = add(num1, num2);
            } else if (input.matches("sub")) {
                res = sub(num1, num2);
            } else if (input.matches("mul")) {
                res = mul(num1, num2);
            } else if (input.matches("div")) {
                res = div(num1, num2);
            } else {
                System.out.println("Please enter an appropriate response.");
            }

            System.out.print(res);
        } finally {
            console.close();
        }
    }

    public static int add(int n1, int n2) {
        return n1 + n2;
    }

    public static int sub(int n1, int n2) {
        return n1 - n2;
    }

    public static int mul(int n1, int n2) {
        return n1 * n2;
    }

    public static int div(int n1, int n2) {
        return n1 / n2;
    }
}

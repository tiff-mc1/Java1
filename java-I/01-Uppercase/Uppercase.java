import java.util.Scanner;

public class Uppercase {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        try {
            System.out.println("Please enter your name: ");
            String name = console.next().toUpperCase();

            System.out.println(name);
        } finally {
            console.close();
        }
    }
}

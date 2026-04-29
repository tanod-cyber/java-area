import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input for getting the height
        System.out.print("What's the length? ");
        int length = scanner.nextInt();

        // User input for getting the width
        System.out.print("What's the width? ");
        int width = scanner.nextInt();

        // Getting the area
        int area = length * width;

        // Print the area

        System.out.println("The area is " + area + "cm^2");

    }
}

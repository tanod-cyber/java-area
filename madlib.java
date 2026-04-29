import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name;
        String place;
        int age;
        // Title
        System.out.println("The game is Madlib pease enter your answer");

        // Name
        System.out.print("please Enter your name: ");
        name = scanner.nextLine();

        // Place
        System.out.print("Please Enter your place: ");
        place = scanner.nextLine();

        // Age
        System.out.print("Please Enter your age: ");
        age = scanner.nextInt();

        // Print the output
        System.out.println("Your name is " + name + " and you live in " + place + " and your age is " + age);
        scanner.close();
    }
}

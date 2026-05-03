import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int i = 0;
        while(true){
            System.out.print("Enter a number 1 to 10: ");
            number = scanner.nextInt();
                if(number < 0 || number >= 10){
                    System.out.println("You Enter wrong number please try again");
                    i++;
                }
                else {
                    System.out.println("You're right!");
                    break;
                }
        }
    }
    
}

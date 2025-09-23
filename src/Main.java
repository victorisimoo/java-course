import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("----- Platzi Play 🍿 -----");

        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name?: ");
        String name = scanner.nextLine();
        System.out.print(name + ", how old are you?: ");
        int years = scanner.nextInt();
        System.out.println("Hi " + name + " " + years + " this is Platzi Play!");

    }
}
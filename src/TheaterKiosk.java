import java.util.*;

public class TheaterKiosk {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = console.nextInt();

        if (age <= 21){
            System.out.println("you get a wrist band.");
        }
    }
}
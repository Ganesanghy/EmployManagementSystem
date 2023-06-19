import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter your choice");
        System.out.println("1.Display room details");
        System.out.println("2.Display room avaliability");
        int ch=obj.nextInt();
        switch (ch) {
            case 1:
                System.out.println("choose room type");
                System.out.println("1.luxury Double room");
                System.out.println("2.Deluxe Double room");
                System.out.println("3.luxury single room");
                System.out.println("4.Deluxe single room");
        }
    }

}
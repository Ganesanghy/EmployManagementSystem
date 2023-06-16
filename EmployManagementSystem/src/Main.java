import java.util.Scanner;

class mainmenu{
    void menu(){
        System.out.println("Press 1: To add new employee details");
        System.out.println("Press 2: To see exciting records");
        System.out.println("press 3: To update");
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Employ Management System");
        mainmenu obj = new mainmenu();
        obj.menu();
        Scanner obj1 = new Scanner(System.in);
    }
}
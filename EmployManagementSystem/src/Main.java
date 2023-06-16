import java.util.Scanner;

class mainmenu{
    String name = "ravi";
    void menu(){
    }
    void display(){
        System.out.println(this.name);
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

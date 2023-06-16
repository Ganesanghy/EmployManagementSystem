
class mainmenu{
    void menu(){
        System.out.println("Press 1: To add new employee details");
        System.out.println("Press 2: To see exciting records");
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Employ Management System");
        mainmenu me = new mainmenu();
        me.menu();
    }
}
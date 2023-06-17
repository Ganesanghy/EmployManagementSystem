import java.util.Scanner;

class Mainmenu{
    void menu(){
        System.out.println("EmployeeManagementSystem");
        System.out.println("------------------------");
        System.out.println("Press 1: To an add Employee details");
        System.out.println("Press 2: To see Employee details");
    }
}
class Employee_Detail{
    String Employ_name;
    String Qualification;
    String email;
    String position;
    String Employ_id;
    int Employ_salary;
    int Employ_age;
    int yearofexp;
    void getInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee's Name-------------- :");
        Employ_name = sc.nextLine();
        System.out.print("Enter Employee's Qualification----- :");
        Qualification = sc.nextLine();
        System.out.print("Enter Employee's Email ID-------- :");
        email = sc.nextLine();
        System.out.print("Enter Employee's Position-------- :");
        position =sc.nextLine();
        System.out.print("Enter Employee ID---------------- :");
        Employ_id = sc.nextLine();
        System.out.print("Enter Employee's salary---------- :");
        Employ_salary = sc.nextInt();
        System.out.print("Enter Employee's age------------- :");
        Employ_age = sc.nextInt();
        System.out.print("Enter Employee's yearofexp------- :");
        yearofexp = sc.nextInt();

    }
}

class Employee_Add{
    void createFile(){
        Employee_Detail ed = new Employee_Detail();
        ed.getInfo();
    }
}
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mainmenu me = new Mainmenu();
        me.menu();
        System.out.println("Press Enter your choice...");
        int i = sc.nextInt();
        switch (i){
            case 1:
                Employee_Add emp = new Employee_Add();
                emp.createFile();
        }

    }
}
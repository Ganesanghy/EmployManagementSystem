import java.util.*;
import java.io.*;
class Mainmenu{
    void menu(){
        System.out.println("\n\nEmployeeManagementSystem");
        System.out.println("------------------------");
        System.out.println("\nPress 1: To an add Employee details");
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
        System.out.print("Enter Employee ID---------------- :");
        Employ_id = sc.nextLine();
        System.out.print("Enter Employee's Email ID-------- :");
        email = sc.nextLine();
        System.out.print("Enter Employee's Qualification----- :");
        Qualification = sc.nextLine();
        System.out.print("Enter Employee's Position-------- :");
        position =sc.nextLine();
        System.out.print("Enter Employee's salary---------- :");
        Employ_salary = sc.nextInt();
        System.out.print("Enter Employee's age------------- :");
        Employ_age = sc.nextInt();
        System.out.print("Enter Employee's yearofexp------- :");
        yearofexp = sc.nextInt();

    }
}
class Employee_Add{
    Scanner sc =new Scanner(System.in);
    void createFile(){
        Employee_Detail ed = new Employee_Detail();
        ed.getInfo();
        try{
            File f1 = new File("file"+ed.Employ_id+".txt");
            if(f1.createNewFile()){
                FileWriter myWriter = new FileWriter("file"+ed.Employ_id+".txt");
                myWriter.write("Employee Name"+ed.Employ_name+"\n"+"Employee Id"+ed.Employ_id+"\n"+"Employee Email_ID"+ed.email+"\n"+
                        "Employee qualification"+ed.Qualification+"\n"+"Employee position"+ed.position+"\n"+"Employee salary"+ed.Employ_salary+"\n"+
                        "Employee age"+ed.Employ_age+"Employee YOE"+ed.yearofexp);
                myWriter.close();
                System.out.println("\nSuccessfully added employee details");
                System.out.println("\npress enter to continue...");
                sc.nextLine();
            }
            else{
                System.out.println("\n Employee already exist");
                System.out.println("\npress enter to continue...");
                sc.nextLine();
            }
        }
        catch(Exception e){
            System.out.println(e);
        }

        }
}
class Employee_show{
    public void viewfile(int emp_id) throws Exception{
        String s = String.valueOf(emp_id);
        File f1 = new File("file"+s+".txt");
        Scanner sc = new Scanner(f1);
        while (sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
    }
}
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee_show epv = new Employee_show();
        Mainmenu me = new Mainmenu();
        me.menu();
        System.out.println("Press Enter your choice...");
        int i = sc.nextInt();
        switch (i){
            case 1:
                Employee_Add emp = new Employee_Add();
                emp.createFile();
                break;
            case 2:
                System.out.println("Press enter employee ID..");
                int emp_id = sc.nextInt();
                try{
                    epv.viewfile(emp_id);
                }
                catch (Exception e){
                    System.out.println(e);
                }
                System.out.println("press enter to continue...");
                me.menu();
                break;

        }
    }
}
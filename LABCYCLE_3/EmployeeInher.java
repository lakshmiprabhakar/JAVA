import java.util.Scanner;

class employee {
    int emp_id, salary;
    String name, address;
    Scanner sn = new Scanner(System.in);

    employee(int emp_id, int salary, String name, String address) {
        this.emp_id = emp_id;
        this.salary = salary;
        this.name = name;
        this.address = address;
    }

}

class teacher extends employee {
    String dept, sub;

    teacher(String dept, String sub, int emp_id, int salary, String name, String address) {
        super(emp_id, salary, name, address);
        this.dept = dept;
        this.sub = sub;
    }

    void setDetails() {
        System.out.print("\nEnter employee ID : \n");
        emp_id = sn.nextInt();
        System.out.print("Enter employee Name : \n");
        name = sn.next();
        System.out.print("Enter employee Salary : \n");
        salary = sn.nextInt();
        System.out.print("Enter employee Address : \n");
        address = sn.next();
        System.out.print("Enter employee Deprtment : \n");
        dept = sn.next();
        System.out.print("Enter employee Subject : \n");
        sub = sn.next();

    }

    void display() {
        System.out.print("\nEmployee ID : " + emp_id + "\nEmployee Name : " + name + "\nTeacher Department : " + dept + "\nSub : " + sub
                + "\nEmployee Salary : " + salary + "\nEmployee Address : " + address + "\n");
    }

}

public class EmployeeInher {
    public static void main(String args[]) {
        int num;
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter number of Teachers : ");
        num = sn.nextInt();
        teacher arr_obj[] = new teacher[num];
        for (int i = 0; i < num; i++) {
            System.out.println("\nEnter Teacher " + (i + 1) + "\n_______");
            arr_obj[i] = new teacher("", "", 0, 0, "", "");
            arr_obj[i].setDetails();
        }
        for (int i = 0; i < num; i++) {
            System.out.println("\nTeacher " + (i + 1) + "\n_______");
            arr_obj[i].display();
        }

    }
}

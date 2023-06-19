import java.util.Scanner;

class Person {
    int age;
    String name, gender, address;
    Scanner sn = new Scanner(System.in);

    Person(String name, int age, String gender, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }
}

class Employee extends Person {
    int emp_id, salary;
    String qualification, company_name;

    Employee(String name, int age, String gender, String address, int emp_id, int salary, String qualification,
            String company_name) {
        super(name, age, gender, address);
        this.emp_id = emp_id;
        this.salary = salary;
        this.qualification = qualification;
        this.company_name = company_name;
    }
}

class Teachers extends Employee {
    int t_id;
    String department, subject;

    Teachers(String name, int age, String gender, String address, int t_id, int emp_id, int salary,
            String qualification, String company_name, String department, String subject) {
        super(name, age, gender, address, emp_id, salary, qualification, company_name);
        this.t_id = t_id;
        this.department = department;
        this.subject = subject;
    }

    void setDetails() {
        System.out.print("\nEnter employee Name : ");
        name = sn.next();
        System.out.print("\nEnter employee Age : ");
        age = sn.nextInt();
        System.out.print("\nEnter employee Gender : ");
        gender = sn.next();
        System.out.print("\nEnter employee Address : ");
        address = sn.next();
        System.out.print("\nEnter employee emp_id : ");
        emp_id = sn.nextInt();
        System.out.print("\nEnter employee salary : ");
        salary = sn.nextInt();
        System.out.print("\nEnter employee Qualification : ");
        qualification = sn.next();
        System.out.print("\nEnter employee company : ");
        company_name = sn.next();
        System.out.print("Enter employee teacher id : ");
        t_id = sn.nextInt();
        System.out.print("Enter employee department : ");
        department = sn.next();
        System.out.print("Enter employee subject : ");
        subject = sn.next();
    }

    void display() {
        System.out.print("\nEmp_name : " + name + "\nAge: " + age + "\nGender : " + gender + "\nAddress: " + address
                + "\nID : " + emp_id + "\nSalary : " + salary + "\nQualification : " + qualification + "\nCompany : "
                + company_name + "\nteacher id : " + t_id + "\ndepartment : " + department + "\nsubject : " + subject);
    }
}

class PersonInher {
    public static void main(String args[]) {
        int num;
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter number of Teachers: ");
        num = sn.nextInt();
        Teachers arr_obj[] = new Teachers[num];
        for (int i = 0; i < num; i++) {
            System.out.println("\nEnter Teacher " + (i + 1) + "\n_______");
            arr_obj[i] = new Teachers("", 0, "", "", 0, 0, 0, "", "", "", "");
            arr_obj[i].setDetails();
        }
        for (int i = 0; i < num; i++) {
            System.out.println("\nTeacher " + (i + 1) + "\n_______");
            arr_obj[i].display();
           
        }
    }
}

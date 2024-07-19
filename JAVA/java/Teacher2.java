import java.util.Scanner;

public class Teacher2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number of teachers
        System.out.print("Enter number of teachers: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline left by nextInt()

        // Array to store teachers
        Teacher[] teachers = new Teacher[n];

        // Read details for each teacher
        for (int i = 0; i < n; i++) {
            System.out.println("---------------- Teacher " + (i + 1) + "----------------");
            teachers[i] = Teacher.readTeacher(sc);
        }

        // Display the teachers
        System.out.println("Name\t\tGender\tAddress\t\tAge\tEmpId\tCompany_name\tQualification\tSalary\tTeacherId\tSubject\tDepartment");
        for (Teacher tr : teachers)
            System.out.println(tr);

        sc.close();
    }

}

class Person {

    String Name;
    String Gender;
    String Address;
    int Age;

    Person(String Name, String Gender, String Address, int Age) {
        this.Name = Name;
        this.Gender = Gender;
        this.Address = Address;
        this.Age = Age;
    }

    // Read a person
    public static Person readPerson(Scanner sc) {
        System.out.print("Name: ");
        String Name = sc.nextLine();

        System.out.print("Gender: ");
        String Gender = sc.nextLine();

        System.out.print("Address: ");
        String Address = sc.nextLine();

        System.out.print("Age: ");
        int Age = sc.nextInt();
        sc.nextLine(); // Consume newline left by nextInt()
        return new Person(Name, Gender, Address, Age);
    }

    // String Representation
    public String toString() {
        return this.Name + "\t" + this.Gender + "\t" + this.Address + "\t" + this.Age;
    }

}

class Employee extends Person {

    int EmpId;
    String Company_name;
    String Qualification;
    int Salary;

    // Inherited Constructor
    Employee(String Name, String Gender, String Address, int Age, int EmpId, String Company_name, String Qualification,
            int Salary) {
        super(Name, Gender, Address, Age);
        this.EmpId = EmpId;
        this.Company_name = Company_name;
        this.Qualification = Qualification;
        this.Salary = Salary;
    }

    @Override
    public String toString() {
        return super.toString() + "\t" + this.EmpId + "\t" + this.Company_name + "\t" + this.Qualification + "\t\t"
                + this.Salary;
    }

}

class Teacher extends Employee {

    int TeacherId;
    String Subject;
    String Department;

    // Inherited Constructor
    Teacher(String Name, String Gender, String Address, int Age, int EmpId, String Company_name, String Qualification,
            int Salary, int TeacherId, String Subject, String Department) {
        super(Name, Gender, Address, Age, EmpId, Company_name, Qualification, Salary);
        this.TeacherId = TeacherId;
        this.Department = Department;
        this.Subject = Subject;
    }

    // Read a teacher
    public static Teacher readTeacher(Scanner sc) {
        System.out.print("Name: ");
        String Name = sc.nextLine();

        System.out.print("Gender: ");
        String Gender = sc.nextLine();

        System.out.print("Address: ");
        String Address = sc.nextLine();

        System.out.print("Age: ");
        int Age = sc.nextInt();
        sc.nextLine(); // Consume newline left by nextInt()

        System.out.print("EmpId: ");
        int EmpId = sc.nextInt();
        sc.nextLine(); // Consume newline left by nextInt()

        System.out.print("Company Name: ");
        String Company_name = sc.nextLine();

        System.out.print("Qualification: ");
        String Qualification = sc.nextLine();

        System.out.print("Salary: ");
        int Salary = sc.nextInt();
        sc.nextLine(); // Consume newline left by nextInt()

        System.out.print("Teacher Id: ");
        int TeacherId = sc.nextInt();
        sc.nextLine(); // Consume newline left by nextInt()

        System.out.print("Subject: ");
        String Subject = sc.nextLine();

        System.out.print("Department: ");
        String Department = sc.nextLine();

        return new Teacher(Name, Gender, Address, Age, EmpId, Company_name, Qualification, Salary, TeacherId, Subject,
                Department);
    }

    @Override
    public String toString() {
        return super.toString() + "\t" + this.TeacherId + "\t\t" + this.Subject + "\t" + this.Department;
    }

}

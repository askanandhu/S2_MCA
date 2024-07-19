import java.util.Scanner;

public class Employee {

    int eNo;
    String eName;
    int eSalary;

    Employee(int eNo, String eName, int eSalary) {
        this.eNo = eNo;
        this.eName = eName;
        this.eSalary = eSalary;
    }

    public static Employee[] readEmployeeArray(Scanner sc) {
        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();
        Employee[] arr = new Employee[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the details of employee " + (i + 1) + ":");
            System.out.print("Employee Number: ");
            int eNo = sc.nextInt();
            sc.nextLine();
            System.out.print("Employee Name: ");
            String eName = sc.nextLine();
            System.out.print("Employee Salary: ");
            int eSalary = sc.nextInt();
            sc.nextLine();
            arr[i] = new Employee(eNo, eName, eSalary);
        }
        return arr;
    }

    static int searchEmployee(Employee[] employees, int eNo) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].eNo == eNo) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] employees = readEmployeeArray(sc);
        System.out.print("Enter the employee number to search: ");
        int eNo = sc.nextInt();
        int index = searchEmployee(employees, eNo);
        if (index == -1) {
            System.out.println("Employee not found!");
        } else {
            System.out.println("Employee with employee number " + eNo + " found at index " + index);
            System.out.println("Employee Name: " + employees[index].eName);
        }
        sc.close();
    }
}


package javaprograms;

public class Employee {
    int salary;
    String name;

   
    Employee(int salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    
    public void Display() {
        System.out.println(" Name : " + name + "  Salary : " + salary);
    }

    public static void main(String[] args) {
       
        Employee[] employees = new Employee[5];
 
        employees[0] = new Employee(45000, "AAA");
        employees[1] = new Employee(55000, "BBB");
        employees[2] = new Employee(60000, "CCC");
        employees[3] = new Employee(48000, "DDD");
        employees[4] = new Employee(63000, "KKK");

        for (int i = 0; i < employees.length; i++) {
            employees[i].Display();
        }
    }
}

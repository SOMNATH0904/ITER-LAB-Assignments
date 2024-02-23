/*
Define a base class Person with instance variable name, age. The instance variables are
initialized through constructors. The prototype of constructor is as below.
Person (string, int)
Define a derived class Employee with instance variables Eid, salary. The instance variables
are initialized through constructors. The prototype of constructor is as below.
Employee (string, int, int, double). Another instance method of Employee class is empDisplay()
to display the information of employee details.
*/

class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person {
    int Eid;
    double Salary;
    public Employee(String name, int age, int Eid, double Salary) {
        super(name, age);
        this.Eid = Eid;
        this.Salary = Salary;
    }

    void display() {
        System.out.println("Name of Employee : "+name);
        System.out.println("Age of Employee : "+age);
        System.out.println("EId of Employee : "+Eid);
        System.out.println("Salary of Employee : "+Salary);
    }
}

public class Q7 {
    public static void main(String[] args) {
        Employee P1 = new Employee("Ram", 25, 1251, 34242.56);
        P1.display();
    }
}
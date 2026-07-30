class Person {
    String name = "Rahul";

    void display() {
        System.out.println("Name: " + name);
    }
}

class Employee extends Person {
    int empId = 101;

    @Override
    void display() {
        super.display();
        System.out.println("Employee ID: " + empId);
    }
}

class Manager extends Employee {
    String dep = "IT";

    @Override
    void display() {
        super.display();
        System.out.println("Department: " + dep);
    }
}

class Ma {
    public static void main(String[] args) {

        // Multilevel Inheritance
        Manager m = new Manager();
        System.out.println("Manager Details:");
        m.display();

        // Runtime Polymorphism
        System.out.println("\nRuntime Polymorphism:");

        Person p;

        p = new Employee();
        p.display();

        System.out.println();

        p = new Manager();
        p.display();
    }
}
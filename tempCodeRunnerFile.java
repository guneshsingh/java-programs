class Employee {
    int id;
    String name;

    Employee() {
        id = 0;
        name = "Unknown";
    }

    Employee(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println("Employee id: " + id);
        System.out.println("Employee name: " + name);
    }
}

class ma {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee(101, "Rahul");

        System.out.println("Employee 1 Details");
        e1.display();

        System.out.println();

        System.out.println("Employee 2 Details");
        e2.display();
    }
}




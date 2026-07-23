// wap to create a class mobile   to initialize company name and price using the constructor and showing the didplay
class Mobile {
    String companyName;
    double price;
    Mobile(String companyName, double price) {
        this.companyName = companyName;
        this.price = price;
    }
    void display() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Price: " + price);
    }
}
class Main {
    public static void main(String[] args) {
        Mobile m1 = new Mobile("Samsung", 24999);
        Mobile m2 = new Mobile("Apple", 79999);
        System.out.println("Mobile 1 Details:");
        m1.display();
        System.out.println();
        System.out.println("Mobile 2 Details:");
        m2.display();
    }
}
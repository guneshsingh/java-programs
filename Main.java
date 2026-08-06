interface Vehicle{
    public abstract void start();
    public abstract void stop();
}
// Anstract class
abstract class Machine {
    public abstract void fuelType();
    public void display()
    {
        System.out.println("This is a machine");
    }
}
// car class
class Car extends Machine implements Vehicle{
    @Override
    public void start(){
        System.out.println("Car starts with a key.");
    }
    @Override
    public void stop(){
        System.out.println("Car stops by applying brake and turning off the engine.");
    }
    @Override
    public void fuelType(){
        System.out.println("Car uses Petrol fuel.");
    }
}
// Bike class
class Bike extends Machine implements Vehicle{
    @Override
    public void start(){
        System.out.println("Bike starts with a self-start button.");
    }
    @Override
    public void stop(){
        System.out.println("Bike stops by applying brake and turning off the engine.");
    }
    @Override
    public void fuelType(){
        System.out.println("Bike uses Petrol fuel.");
    }
}
// /MAin class
public class Main{
    public static void main(String[] args) {
        Car car=new Car();
        System.out.println("Car Details:");
        car.display();
        car.start();
        car.fuelType();
        car.stop();
        System.out.println();
        Bike bike=new Bike();
        System.out.println("Bike Details:");
        bike.display();
        bike.start();
        bike.fuelType();
        bike.stop();
    }
}





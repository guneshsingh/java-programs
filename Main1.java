import java.util.*;
class MyException extends Exception{
    MyException(String msg)
    {
        super(msg);
    }
}
public class Main1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // Divison
        try{
            System.out.println("Enter two numbers:");
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println("Result="+(a/b));
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
        finally{
            System.out.println("Division Completed");
        }
        // USer defined Exception
        try{
            System.out.println("Enter age:");
            int age=sc.nextInt();
            if(age<18)
                throw new MyException("Invalid Age");
                    System.out.println("Valid Age");
        }
        catch(MyException e)
        {
            System.out.println(e.getMessage());
        }
        sc.close();
        
    }
}

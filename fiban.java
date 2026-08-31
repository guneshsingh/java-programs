import java.util.*;
public class fiban{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        System.out.println(0);
        System.out.println(1);
        for(int i=1;i<n-1;i++){
            int c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
        
    }
}
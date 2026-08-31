import java.util.*;
public class pattern_prime{
    static boolean fun(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0)return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int m=2;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
               System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
               while(!fun(m)){
                m++;
               }
               System.out.print(m+" ");
               m++;
            }
            for(int j=1;j<=n-i;j++){
               System.out.print(" ");
            }
            System.out.println();
        }
    }
}

import java.util.*;

public class c3 {
    static int fun(int n,int[]arr){
            Map<Integer,Integer>mpp=new HashMap<>();
            for(int i=0;i<n;i++){
                mpp.put(arr[i],mpp.getOrDefault(arr[i],0)+1);
            }
            int s=0;
            for(Map.Entry<Integer,Integer>i:mpp.entrySet()){
                if(i.getKey()%2==0&& i.getValue()>1){
                    s+=i.getValue();
                }
            }
            return s;
        }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            arr[i]=a;
        }
        System.out.println(fun(n,arr));
        

        sc.close();
    }
}


    import java.sql.Struct;
import java.util.*;
    
    public class c2 {
        public static class quer{
            String s;
            int start;
            int end;
            public quer(String s, int start, int end) {
            this.s = s;
            this.start = start;
            this.end = end;
        }
        }
        
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n=sc.nextInt();
            int [] arr=new int[n];;
            for(int i=0;i<n;i++){
                int a=sc.nextInt();
                arr[i]=a;
            }
            int q=sc.nextInt();
            int[] prefix=new int[n];
            prefix[0]=arr[0];
            for(int i=1;i<n;i++){
                prefix[i]=prefix[i-1]+arr[i];
            }
            
            String s;
            int start,end;
            quer[] ar=new quer[q];
            for(int i=0;i<q;i++){
                s=sc.next();
                start=sc.nextInt();
                end=sc.nextInt();
                quer c=new quer(s,start,end);
                ar[i]=c;
            }
            for(int i=0;i<q;i++){
                System.out.println("QueryID: "+ar[i].s+" | "+"Total usage "+ (prefix[ar[i].end]-prefix[ar[i].start-1]));
            }


            
    
            sc.close();
        }
    }



    import java.util.*;
    
    public class c1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n=sc.nextInt();
            String k;
            int v;
            Map<String,Integer>mpp=new HashMap<>();
            for(int i=0;i<n;i++){
                k=sc.next();
                v=sc.nextInt();
                mpp.put(k,v);
            }
            String ans="";
            int maxi=Integer.MIN_VALUE;
            for(Map.Entry<String,Integer>i:mpp.entrySet()){
                if(i.getValue()>maxi|| (i.getValue()==maxi&& i.getKey().compareTo(ans)<0)){
                    maxi=i.getValue();
                    ans=i.getKey();
                }
            }
            System.out.println(ans+" "+maxi);
    
            sc.close();
        }
    }

  
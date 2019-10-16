
public class practiceAssignment3
{

    public static void main(String[] args){
        int e=0;
        double w=0;
        int t=0;
            for(int i=0;i<=100;i++){
            e=i;
            double a=Math.pow(e,2);
            w=w+a;
        }
        System.out.println(w);
        for(int j=0;j<=100;j++){
            t=t+j;
          
        }
        double q=Math.pow(t,2);
        System.out.println(q);
        System.out.println(q-w);
    }
}




public class practiceAssignment1
{
   public static void main (String[] args){
       int d=0;
       for(int i=0;i<1000;i++){
           if(i%3==0 ||i%5==0){
              d=d+i; 
            } 
        }
       System.out.println(d);
       
    }
}

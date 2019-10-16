public class practiceAssignment2
{
    public static void main(String[] args){
   int w=1;
   int w1=2;
   int w2=w+w1;
   int w3=0;
   while(w2<4000000){
       w=w1;
       w1=w2;
       w2=w+w1;
       if(w2%2==0){
           w3=w3+w2;
        }
    
}
System.out.println(w3+2);
    }
}


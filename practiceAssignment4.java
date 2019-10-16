
public class practiceAssignment4
{
      public static void main(String[] args) {
        
        for (int a = 1; a <= 1000; a++) {
            for (int b = a + 1; b < 1000; b++) {
                
                double cSquared = Math.pow(a, 2) + Math.pow(b, 2);
                double c = Math.pow(cSquared, 0.5);
                
                if (a + b + c == 1000) {
                    System.out.println(a );
                    System.out.println(b);
                    System.out.println(c);
                    System.out.println(a * b * c);
                    break;
                }
            }
        }
    }

        //((Math.sqrt(Math.pow(b,2)+Math.pow(c,2)))==d)
}

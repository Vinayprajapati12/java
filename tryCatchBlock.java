package company;

public class tryCatchBlock {
    public static void main(String[] args) {
        int a = 12;
        int b = 0;
        try{
            int c = a/b;
            System.out.println("The result is: " + c);

        }
        catch(Exception e){
            System.out.println("We failed to divide Reason: ");
            System.out.println(e);
        }
        System.out.println("End of the program...");
    }
}

/* 
output

  We failed to divide Reason: 
java.lang.ArithmeticException: / by zero
End of the program...

*/

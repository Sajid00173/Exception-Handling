

public class ExceptionHandling {

    public static void main(String[] args) {
        try{
            int x = 10, y = 0;
            int z = x / y;
            System.out.println(" "+z);
        }
        catch (ArithmeticException e) //we can use only Exception, if we dont know the exception name
        {
            System.out.println("Exception: "+e);
        }
        finally {
            System.out.println("Sajid"); //compiler must read this finally
        }
    }
}
